package cn.com.jy.hotel.shiro;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import cn.com.jy.hotel.domain.system.SysOperator;
import cn.com.jy.hotel.service.system.SysOperatorService;


@Component("myRealm")
public class MyRealm extends AuthorizingRealm{

	@Resource
	private SysOperatorService sysOperatorService;
	
	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		SysOperator sysOperator = null;
		Short operatorNumber = Short.valueOf(usernamePasswordToken.getUsername());

		try {
			sysOperator = sysOperatorService.queryByUniqueKey("operatorNumber", operatorNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(sysOperator==null){		//该用户不存在
			throw new UnknownAccountException();//用户不存在
		}else{		//该用户存在
			if(ShiroUtils.CheckLoginMd5Password(String.valueOf(usernamePasswordToken.getPassword()), sysOperator)){
				SecurityUtils.getSubject().getSession().setAttribute("sysOperator", sysOperator);
				usernamePasswordToken.setPassword(sysOperator.getOperatorPwd().toCharArray());
				AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(sysOperator,sysOperator.getOperatorPwd(),getName());
				return authenticationInfo;
			}
			else{
				throw new AuthenticationException();//密码不对
			}
		}
	}
	
	/**
	 * 授权
	 * 
	 * 
	 * 在ServiceImpl配置方法注解：@RequiresPermissions("部门查询")
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		//根据用户获取权限，把用户能够访问到的权限封装在authorizationInfo对象中
		//User user = (User)SecurityUtils.getSubject().getSession().getAttribute("user");
		/*Collection<Privilege> privileges =  null;
		if(user.getUsername().equals("admin")){
			privileges = this.privilegeService.getFunctions();
		}else{
			privileges = this.privilegeService.getFunctionsByUid(user);
		}
		for(Privilege privilege:privileges){
			authorizationInfo.addStringPermission(privilege.getName());
		}*/
		
		authorizationInfo.addStringPermission("我");
		authorizationInfo.addStringPermission("爱");
		authorizationInfo.addStringPermission("你");
		//authorizationInfo.addStringPermission("部门查询");
		return authorizationInfo;
	}

}

/**
验证机制		shiro是第二种
第一种做法：
     写一个验证方法，方法的参数是username和password，如果返回一个对象，则
    证明验证成功，如果返回的是null，说明验证失败
第二种做法
     写一个验证方法，方法的参数是username，如果返回的是一个对象，该对象中的
     password和登录的时候输入的password对比，如果一样，则成功，如果不一样
     则失败，如果返回的是一个null,用户名都不存在
*/