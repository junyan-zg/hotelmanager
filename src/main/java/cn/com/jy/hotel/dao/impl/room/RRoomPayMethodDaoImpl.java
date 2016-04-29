/**   
* @Title: RRoomPayMethodDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.room;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RRoomPayMethodDao;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;

/** 
 * @ClassName: RRoomPayMethodDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("rRoomPayMethodDao")
public class RRoomPayMethodDaoImpl extends BaseDaoImpl<RRoomPayMethod> implements RRoomPayMethodDao{

	@Override
	public Long getRoomPayMethodCount(Byte payType, boolean useCache)
			throws Exception {
		String hql = "select count(id) from RRoomPayMethod where status != 2 and payType = ?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, payType);
		return (long) query.setCacheable(useCache).uniqueResult();
	}

}
