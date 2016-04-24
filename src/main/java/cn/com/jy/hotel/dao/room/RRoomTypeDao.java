/**   
* @Title: RRoomTypeDao.java 
* @Package cn.com.jy.hotel.dao.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:13:46 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.room;

import java.util.List;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;

/** 
 * @ClassName: RRoomTypeDao 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:13:46
 *  
 */
public interface RRoomTypeDao extends BaseDao<RRoomType>{
	/**
	 * 返回一个在hql里面new的对象
	 */
	public List<RRoomTypeSub> queryReturnSub(Integer limitOffset, Integer limitCount,boolean useCache) throws Exception;
	public List<RRoomTypeSubForSelect> getRoomTypeAllForSelect(boolean useCache)throws Exception;
}
