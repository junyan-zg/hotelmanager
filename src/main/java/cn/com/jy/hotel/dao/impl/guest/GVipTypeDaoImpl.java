/**   
* @Title: GVipTypeDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.guest;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.guest.GVipTypeDao;
import cn.com.jy.hotel.domain.guest.GVipType;

/** 
 * @ClassName: GVipTypeDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("gVipTypeDao")
public class GVipTypeDaoImpl extends BaseDaoImpl<GVipType> implements GVipTypeDao{

}
