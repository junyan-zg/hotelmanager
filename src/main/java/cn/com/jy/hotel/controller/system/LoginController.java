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
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.jy.hotel.exception.MyException;

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
	public String su_login() {
		return "/su/login";
	}

	@RequestMapping("su/loginCheck")
	public String su_login_check(String operatorNumber, String operatorPwd)
			throws Exception {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(operatorNumber,
				operatorPwd);
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			throw new MyException("账号或密码错误！", false);
		}
		return "redirect:/su/index";
	}
}
