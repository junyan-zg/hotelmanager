/**   
* @Title: GVipDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.guest;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.guest.GVipDao;
import cn.com.jy.hotel.domain.guest.GVip;

/** 
 * @ClassName: GVipDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("gVipDao")
public class GVipDaoImpl extends BaseDaoImpl<GVip> implements GVipDao{

}
