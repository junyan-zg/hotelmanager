/**   
* @Title: GCheckInDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.guest;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.guest.GCheckInDao;
import cn.com.jy.hotel.domain.guest.GCheckIn;

/** 
 * @ClassName: GCheckInDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("gCheckInDao")
public class GCheckInDaoImpl extends BaseDaoImpl<GCheckIn> implements GCheckInDao{

}
