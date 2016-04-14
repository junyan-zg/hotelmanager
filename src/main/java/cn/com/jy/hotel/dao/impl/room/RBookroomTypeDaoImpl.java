/**   
* @Title: RBookroomTypeDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.room;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RBookroomTypeDao;
import cn.com.jy.hotel.domain.room.RBookroomType;

/** 
 * @ClassName: RBookroomTypeDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("rBookroomTypeDao")
public class RBookroomTypeDaoImpl extends BaseDaoImpl<RBookroomType> implements RBookroomTypeDao{

}
