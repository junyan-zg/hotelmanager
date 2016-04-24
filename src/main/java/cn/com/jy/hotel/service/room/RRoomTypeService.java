/**   
* @Title: RRoomTypeService.java 
* @Package cn.com.jy.hotel.service.room 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.room;

import java.util.List;

import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;
import cn.com.jy.hotel.service.BaseService;

/** 
 * @ClassName: RRoomTypeService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:17:36 
 *  
 */
public interface RRoomTypeService extends BaseService<RRoomType>{
	public List<RRoomTypeSub> getByPages(Integer pageNumber,Integer pageSize) throws Exception;
	public List<RRoomTypeSubForSelect> getRoomTypeAllForSelect() throws Exception;
}
