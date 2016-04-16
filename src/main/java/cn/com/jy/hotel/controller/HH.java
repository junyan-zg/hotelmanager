/**   
* @Title: HH.java 
* @Package cn.com.jy.hotel.controller 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午7:06:25 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.system.SysRole;
import cn.com.jy.hotel.service.system.SysRoleService;

/** 
 * @ClassName: HH 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午7:06:25 
 *  
 */
@Controller
public class HH {
	@Resource
	private SysRoleService sysRoleService;
	
	
	@RequestMapping("dd")
	public @ResponseBody Object dd(){
		/*try {
			 SysRole sysRole = sysRoleService.getById((short)1);
			 return sysRole.getSysPrivileges().iterator().next().getName();
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}*/
		return "11111111";
	}
	
	@RequestMapping("dd2")
	public String dd2(){
		return "/su/login";
	}
}
