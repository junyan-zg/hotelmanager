/**   
* @Title: RRoomPayMethodService.java 
* @Package cn.com.jy.hotel.service.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.room;

import java.util.List;

import cn.com.jy.hotel.domain.room.RRoomPayMethod;
import cn.com.jy.hotel.service.BaseService;

/** 
 * @ClassName: RRoomPayMethodService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:17:36 
 *  
 */
public interface RRoomPayMethodService extends BaseService<RRoomPayMethod>{
	public Long getRoomPayMethodCount(Byte payType,boolean useCache) throws Exception;
	public List<?> getRoomPayMethodAllByPages(Byte payType,Integer pageNumber,
			Integer pageSize,boolean useCache) throws Exception;
}
