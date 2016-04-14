/**   
* @Title: GGuestDetailDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.guest;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.guest.GGuestDetailDao;
import cn.com.jy.hotel.domain.guest.GGuestDetail;

/** 
 * @ClassName: GGuestDetailDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("gGuestDetailDao")
public class GGuestDetailDaoImpl extends BaseDaoImpl<GGuestDetail> implements GGuestDetailDao{

}
