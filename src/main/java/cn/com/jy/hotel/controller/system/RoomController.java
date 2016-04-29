/**   
 * @Title: RoomController.java 
 * @Package cn.com.jy.hotel.controller.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月25日 上午2:36:54 
 * @version V1.0   
 */
package cn.com.jy.hotel.controller.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.data.Helper;
import cn.com.jy.hotel.data.RoomStatusMap;
import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.room.RRoomGroupService;
import cn.com.jy.hotel.service.room.RRoomService;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/**
 * @ClassName: RoomController
 * @Description: TODO
 * @author zjy
 * @date 2016年4月25日 上午2:36:54
 * 
 */
@Controller
@RequestMapping("/su/system")
public class RoomController {
	@Resource
	private RRoomTypeService rRoomTypeService;
	@Resource
	private RRoomService rRoomService;
	@Resource
	private RRoomGroupService rRoomGroupService;

	@ResponseBody
	@RequestMapping("/getRoomCount/{group_id}")
	public Long getRoomCount(@PathVariable Short group_id) throws Exception {
		return rRoomService.getCountByGroupId(group_id, true);
	}

	@ResponseBody
	@RequestMapping("/getRoomTypeAll")
	public List<RRoomTypeSubForSelect> getRoomTypeAllForSelect()
			throws Exception {
		return rRoomTypeService.getRoomTypeAllForSelect();
	}

	@ResponseBody
	@RequestMapping("/getRoomAllByPages/{group_id}/{pageNumber}/{pageSize}")
	public List<RRoomSub> getRoomAllByPages(@PathVariable Short group_id,
			@PathVariable Integer pageNumber,
			@PathVariable Integer pageSize) throws Exception {
		return rRoomService.getRoomAllByPages(group_id, pageNumber, pageSize);
	}
	@ResponseBody
	@RequestMapping("/getRoomStatusAll")
	public List<Helper> getRoomStatusAll() throws Exception {
		return RoomStatusMap.getHelperList();
	}

	@ResponseBody
	@RequestMapping("/addRoom")
	public void addRoom(RRoomSub rRoomSub) throws Exception {
		RRoom rRoom = new RRoom();
		rRoom.setRRoomGroup(rRoomGroupService.getById(rRoomSub.getGroup_id()));
		rRoom.setRoomNumber(rRoomSub.getRoomNumber());
		rRoom.setRRoomType(rRoomTypeService.queryByUniqueKey("roomTypeName", rRoomSub.getRoomTypeName()));
		rRoom.setRoomStatus(RoomStatusMap.getByte(rRoomSub.getRoomStatusName()));
		try {
			rRoomService.add(rRoom);
		} catch (Exception e) {
			throw new MyException("添加失败，该区域下已存在一个同名的房间", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/updateRoom")
	public void updateRoom(RRoomSub roomSub) throws Exception {
		RRoom rRoom = rRoomService.getById(roomSub.getId());
		rRoom.setRoomNumber(roomSub.getRoomNumber());
		rRoom.setRRoomType(rRoomTypeService.queryByUniqueKey("roomTypeName", roomSub.getRoomTypeName()));
		rRoom.setRoomStatus(RoomStatusMap.getByte(roomSub.getRoomStatusName()));
		try {
			rRoomService.update(rRoom);
		} catch (Exception e) {
			throw new MyException("更新失败，该区域下已存在一个同名的房间", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/delRoom")
	public void delRoom(Integer id) throws Exception {
		try {
			rRoomService.delete(id);
		} catch (Exception e) {
			throw new MyException("删除失败", (short) 0);
		}
	}
}
