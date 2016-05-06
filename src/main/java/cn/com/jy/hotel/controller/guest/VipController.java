/**   
* @Title: VipController.java 
* @Package cn.com.jy.hotel.controller.guest 
* @Description: TODO 
* @author zjy   
* @date 2016年5月6日 上午9:07:24 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.guest;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.guest.GVip;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.guest.GVipService;

/** 
 * @ClassName: VipController 
 * @Description: TODO 
 * @author zjy
 * @date 2016年5月6日 上午9:07:24 
 *  
 */
@Controller
@RequestMapping("/su/guest/vip")
public class VipController {
	@Resource
	private GVipService gVipService;
	
	@RequestMapping("/getAddVip")
	public String getAddVip(){
		
		return "/su/vip/addVip";
	}
	@RequestMapping("/getFindVip")
	public String getFindVip(){
		
		return "/su/vip/findVip";
	}
	@ResponseBody
	@RequestMapping("/addVip")
	public String addVip(GVip gVip) throws Exception{
		try {
			gVipService.add(gVip);
		} catch (Exception e) {
			throw new MyException("添加失败，该手机号码已注册", (short)0);
		}
		return "添加成功";
	}
	@ResponseBody
	@RequestMapping("/findVipByPhone")
	public String findVipByPhone(GVip gVip) throws Exception{
		try {
			gVipService.add(gVip);
		} catch (Exception e) {
			throw new MyException("添加失败，该手机号码已注册", (short)0);
		}
		return "添加成功";
	}
}
