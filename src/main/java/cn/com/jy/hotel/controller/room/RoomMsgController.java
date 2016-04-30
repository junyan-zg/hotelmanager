/**   
* @Title: RoomMsgController.java 
* @Package cn.com.jy.hotel.controller.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月30日 下午2:02:21 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.room;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.jy.hotel.service.room.RRoomGroupService;

/** 
 * @ClassName: RoomMsgController 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月30日 下午2:02:21 
 *  
 */
@Controller
@RequestMapping("/su/room")
public class RoomMsgController {
	@Resource
	private RRoomGroupService rRoomGroupService;
	@RequestMapping("/getShowRooms")
	public String getShowRooms(HttpServletRequest request) throws Exception{
		request.setAttribute("rooms",rRoomGroupService.getAllRoomGroupHtml());
		return "/su/room/getShowRooms";
	}
}
