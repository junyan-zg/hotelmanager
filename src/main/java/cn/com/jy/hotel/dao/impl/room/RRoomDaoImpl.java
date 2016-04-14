/**   
* @Title: RRoomDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.room;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RRoomDao;
import cn.com.jy.hotel.domain.room.RRoom;

/** 
 * @ClassName: RRoomDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("rRoomDao")
public class RRoomDaoImpl extends BaseDaoImpl<RRoom> implements RRoomDao{

}
