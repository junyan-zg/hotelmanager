/**   
* @Title: RRoomDao.java 
* @Package cn.com.jy.hotel.dao.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:13:45 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.room;

import java.util.List;
import java.util.Set;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.domain.room.RRoom;

/** 
 * @ClassName: RRoomDao 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:13:45
 *  
 */
public interface RRoomDao extends BaseDao<RRoom>{
	public Long getCountByGroupId(Short group_id,boolean useCache) throws Exception;
	/**
	 * service收到父groupid参数，根据父groupid参数拿到子groupid传到dao
	 * service判断参数，如果查询全部则将参数置为空
	 */
	public List<RRoom> getRoomsByConditions(Set<Short> groupIds, Short typeId,
			Byte statusId, String roomNumber,boolean useCache) throws Exception;
}
