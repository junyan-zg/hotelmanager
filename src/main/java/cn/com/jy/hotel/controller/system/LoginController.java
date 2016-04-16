/**   
* @Title: LoginController.java 
* @Package cn.com.jy.hotel.controller.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月16日 上午3:13:10 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.system;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.jy.hotel.shiro.EndecryptUtils;

/** 
 * @ClassName: LoginController 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月16日 上午3:13:10 
 *  
 */
@Controller
public class LoginController {
	
	@RequestMapping("su/login")
	public String su_login(){
		return "/su/login";
	}
	
	@RequestMapping("su/loginCheck")
	public String su_login_check(String operatorNumber,String operatorPwd){
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(operatorNumber,operatorPwd);
		try{
			subject.login(token);
		}catch (Exception e) {
			e.printStackTrace();
			/*
			UnknownAccountException;//用户不存在
			AuthenticationException;//密码不对
			*/
			System.out.println("用户名或密码错误！");
			//ResponseUtil.out(response, content);
		}
		return "/su/login";
	}
}
