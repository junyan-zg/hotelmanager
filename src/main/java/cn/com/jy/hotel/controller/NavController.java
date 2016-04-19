/**   
* @Title: NavController.java 
* @Package cn.com.jy.hotel.controller.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月17日 上午4:31:51 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @ClassName: NavController 导航
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月17日 上午4:31:51 
 *  
 */
@Controller
@RequestMapping("/su")
public class NavController {
	@RequestMapping("/index")
	public String index(){
		return "/su/index";
	}
	@RequestMapping("/head")
	public String head(){
		return "/su/head";
	}
	@RequestMapping("/left")
	public String left(){
		return "/su/left";
	}
	@RequestMapping("/right")
	public String right(){
		return "/su/right";
	}
}
