/**   
* @Title: RRoomService.java 
* @Package cn.com.jy.hotel.service.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.room;

import cn.com.jy.hotel.domain.room.RRoom;
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
}
