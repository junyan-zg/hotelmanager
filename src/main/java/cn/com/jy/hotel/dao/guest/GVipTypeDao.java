/**   
* @Title: GVipTypeDao.java 
* @Package cn.com.jy.hotel.dao.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:13:45 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.guest;

import java.util.List;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.domain.guest.sub.GVipTypeSub;

/** 
 * @ClassName: GVipTypeDao 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:13:45
 *  
 */
public interface GVipTypeDao extends BaseDao<GVipType>{
	/**
	 * 返回一个在hql里面new的对象
	 */
	public List<GVipTypeSub> queryReturnSub(Integer limitOffset, Integer limitCount,boolean useCache) throws Exception;
}
