/**   
 * @Title: RoomGroupController.java 
 * @Package cn.com.jy.hotel.controller.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月23日 上午12:07:02 
 * @version V1.0   
 */
package cn.com.jy.hotel.controller.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.Tree;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.room.RRoomGroupService;

/**
 * @ClassName: RoomGroupController
 * @Description: TODO
 * @author zjy
 * @date 2016年4月23日 上午12:07:02
 * 
 */
@Controller
@RequestMapping("/su/system")
public class RoomGroupController {
	@Resource
	private RRoomGroupService rRoomGroupService;

	@ResponseBody
	@RequestMapping("/getAllRoomGroup")
	public List<Tree> getAllRoomGroup() throws MyException {
		try {
			return rRoomGroupService.getAllRoomGroup();
		} catch (Exception e) {
			throw new MyException("获取房间分组信息异常",(short)0);
		}
	}
	
	@ResponseBody
	@RequestMapping("/updateRoomGroup")
	public String updateRoomGroup(Short id,String text) throws Exception{
		try{
			rRoomGroupService.updateRoomGroup(id, text);
			return "success";
		}catch(Exception e){
			throw new MyException("更新失败",(short)0);
		}
	}
	@ResponseBody
	@RequestMapping("/addRoomGroup")
	public String addRoomGroup(Short pid,String text) throws Exception{
		try{
			rRoomGroupService.addRoomGroup(pid, text);
			return "success";
		}catch(Exception e){
			throw new MyException("添加失败",(short)0);
		}
	}
	@ResponseBody
	@RequestMapping("/delRoomGroup")
	public String delRoomGroup(Short id) throws Exception{
		try{
			rRoomGroupService.delete(id);
			return "success";
		}catch(Exception e){
			throw new MyException("删除失败",(short)0);
		}
	}
}
