/**   
* @Title: NavController.java 
* @Package cn.com.jy.hotel.controller.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月17日 上午4:31:51 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.system;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/** 
 * @ClassName: NavController 导航
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月17日 上午4:31:51 
 *  
 */
@Controller
@RequestMapping("/su/system")
public class NavSysController {

	@Resource
	private RRoomTypeService rRoomTypeService;
	
	@RequestMapping("/roomManager")
	public String roomManager(HttpServletRequest request) throws Exception{
		request.setAttribute("roomTypeCount", rRoomTypeService.getCount(true));
		return "/su/system/roomManager";
	}
}
