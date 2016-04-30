/**   
* @Title: RRoomGroupService.java 
* @Package cn.com.jy.hotel.service.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.room;

import java.util.List;

import cn.com.jy.hotel.domain.Tree;
import cn.com.jy.hotel.domain.room.RRoomGroup;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.BaseService;

/** 
 * @ClassName: RRoomGroupService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:17:36 
 *  
 */
public interface RRoomGroupService extends BaseService<RRoomGroup>{
	public List<Tree> getAllRoomGroup() throws Exception;
	public String getAllRoomGroupHtml() throws Exception;
	public void updateRoomGroup(Short id,String newName)throws Exception;
	public void addRoomGroup(Short pid,String name)throws Exception;
	public void delroomGroup(Short pid)throws Exception;
}
