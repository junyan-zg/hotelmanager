/**   
* @Title: GVipTypeDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.guest
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.guest;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.guest.GVipTypeDao;
import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.domain.guest.sub.GVipTypeSub;

/** 
 * @ClassName: GVipTypeDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("gVipTypeDao")
public class GVipTypeDaoImpl extends BaseDaoImpl<GVipType> implements GVipTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<GVipTypeSub> queryReturnSub(Integer limitOffset,
			Integer limitCount, boolean useCache) throws Exception {
		String hql = "select new cn.com.jy.hotel.domain.guest.sub.GVipTypeSub"
				+ "(id,vipTypeName,vipDiscount,description) from GVipType";

		Query query = this.getSession().createQuery(hql);

		if (limitOffset != null && limitCount != null) {
			query.setFirstResult(limitOffset);
			query.setMaxResults(limitCount);
		}

		return query.setCacheable(useCache).list();
	}

}
