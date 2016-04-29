/**   
 * @Title: RoomTypeController.java 
 * @Package cn.com.jy.hotel.controller.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月24日 上午5:34:37 
 * @version V1.0   
 */
package cn.com.jy.hotel.controller.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/**
 * @ClassName: RoomTypeController
 * @Description: TODO
 * @author zjy
 * @date 2016年4月24日 上午5:34:37
 * 
 */
@Controller
@RequestMapping("/su/system")
public class RoomTypeController {

	@Resource
	private RRoomTypeService rRoomTypeService;

	@ResponseBody
	@RequestMapping("/getRoomTypeCount")
	public Long getRoomTypeCount() throws Exception {
		return rRoomTypeService.getCount(true);
	}

	@ResponseBody
	@RequestMapping("/getRoomTypeByPages/{pageNumber}/{pageSize}")
	public List<RRoomTypeSub> getByPages(@PathVariable Integer pageNumber,
			@PathVariable Integer pageSize) throws Exception {
		return rRoomTypeService.getByPages(pageNumber, pageSize);
	}

	@ResponseBody
	@RequestMapping("/addRoomType")
	public void addRoomType(RRoomType rRoomType) throws Exception {
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
	}
	
	@ResponseBody
	@RequestMapping("/getRoomTypeAll")
	public List<RRoomTypeSubForSelect> getRoomTypeAllForSelect()
			throws Exception {
		return rRoomTypeService.getRoomTypeAllForSelect();
	}
}
