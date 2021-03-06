/**   
* @Title: RRoomService.java 
* @Package cn.com.jy.hotel.service.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.room;

import java.util.List;
import java.util.Set;

import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.sub.RRoomSub;
import cn.com.jy.hotel.domain.room.sub.RRoomSub2;
import cn.com.jy.hotel.service.BaseService;

/** 
 * @ClassName: RRoomService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:17:36 
 *  
 */
public interface RRoomService extends BaseService<RRoom>{
	public Long getCountByGroupId(Short group_id ,boolean useCache) throws Exception;
	public List<RRoomSub> getRoomAllByPages(Short group_id, Integer pageNumber,
			 Integer pageSize) throws Exception;
	public List<RRoomSub2> getRoomsByConditions(Set<Short> groupIds,Short typeId,Byte statusId,String roomNumber,Integer pageNumber,
			Integer pageSize) throws Exception;
	public Long getRoomsCountByConditions(Set<Short> groupIds,Short typeId,Byte statusId,String roomNumber,boolean useCache) throws Exception;
}
