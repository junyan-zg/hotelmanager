/**   
* @Title: RBookroomDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.room;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RBookroomDao;
import cn.com.jy.hotel.domain.room.RBookroom;

/** 
 * @ClassName: RBookroomDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("rBookroomDao")
public class RBookroomDaoImpl extends BaseDaoImpl<RBookroom> implements RBookroomDao{

}
