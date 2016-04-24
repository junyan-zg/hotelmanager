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

import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;
import cn.com.jy.hotel.exception.MyException;
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
	@RequestMapping("/getRoomTypeByPages/{group_id}/{pageNumber}/{pageSize}")
	public List<RRoom> getRoomAllByPages(@PathVariable Long group_id,
			@PathVariable Integer pageNumber,
			@PathVariable Integer pageSize) throws Exception {
		return null;
	}

	/*@ResponseBody
	@RequestMapping("/addRoom")
	public void addRoomType(RRoom rRoomType) throws Exception {
		try {
			rRoomTypeService.add(rRoomType);
		} catch (Exception e) {
			throw new MyException("添加失败，已存在一个同名的房间类型名称", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/updateRoomType")
	public void updateRoomType(RRoomType rRoomType) throws Exception {
		try {
			rRoomTypeService.update(rRoomType);
		} catch (Exception e) {
			throw new MyException("更新失败，已存在一个同名的房间类型名称", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/delRoomType")
	public void delRoomType(Short id) throws Exception {
		try {
			rRoomTypeService.delete(id);
		} catch (Exception e) {
			throw new MyException("删除失败，因为存在该房间类型的房间", (short) 0);
		}
	}*/
}
