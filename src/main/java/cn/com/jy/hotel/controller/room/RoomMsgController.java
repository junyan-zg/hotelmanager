/**   
* @Title: RoomMsgController.java 
* @Package cn.com.jy.hotel.controller.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月30日 下午2:02:21 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.room;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.room.sub.RRoomSub2;
import cn.com.jy.hotel.service.room.RRoomGroupService;
import cn.com.jy.hotel.service.room.RRoomService;

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
	@Resource
	private RRoomService rRoomService;
	@RequestMapping("/getShowRooms")
	public String getShowRooms(HttpServletRequest request) throws Exception{
		request.setAttribute("rooms",rRoomGroupService.getAllRoomGroupHtml());
		request.setAttribute("roomCount", rRoomService.getRoomsCountByConditions(null, null, null, null, true));
		return "/su/room/getShowRooms";
	}
	@ResponseBody
	@RequestMapping("/getRoomsCountByConditions")
	public Long getRoomsCountByConditions(Short groupId,Short typeId,Byte statusId,String roomNumber) throws Exception{
		Set<Short> groupIds = null;
		if (groupId != null && groupId != 0) {
			groupIds = rRoomGroupService.getAllChild(groupId, true);
		}
		return rRoomService.getRoomsCountByConditions(groupIds, typeId, statusId, roomNumber, true);
	}
	
	@ResponseBody
	@RequestMapping("/getRoomsByConditions")
	public List<RRoomSub2> getRoomsByConditions(Short groupId,Short typeId,Byte statusId,String roomNumber,Integer pageNumber,
			Integer pageSize) throws Exception{
		Set<Short> groupIds = null;
		if (groupId != null && groupId != 0) {
			groupIds = rRoomGroupService.getAllChild(groupId, true);
		}
		List<RRoomSub2> results = rRoomService.getRoomsByConditions(groupIds, typeId, statusId, roomNumber, pageNumber, pageSize);
		return results;
	}
}
