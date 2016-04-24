/**   
 * @Title: RRoomTypeDaoImpl.java 
 * @Package cn.com.jy.hotel.dao.impl.room
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月15日 上午6:15:2 
 * @version V1.0   
 */
package cn.com.jy.hotel.dao.impl.room;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RRoomTypeDao;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSub;
import cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect;

/**
 * @ClassName: RRoomTypeDaoImpl
 * @Description: TODO
 * @author zjy
 * @date 2016年4月15日 上午6:15:2
 * 
 */
@Repository("rRoomTypeDao")
public class RRoomTypeDaoImpl extends BaseDaoImpl<RRoomType> implements
		RRoomTypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<RRoomTypeSub> queryReturnSub(Integer limitOffset,
			Integer limitCount, boolean useCache) throws Exception {
		String hql = "select new cn.com.jy.hotel.domain.room.sub.RRoomTypeSub"
				+ "(id,roomTypeName,maxPeople,description,deposit) from RRoomType";

		Query query = this.getSession().createQuery(hql);

		if (limitOffset != null && limitCount != null) {
			query.setFirstResult(limitOffset);
			query.setMaxResults(limitCount);
		}

		return query.setCacheable(useCache).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RRoomTypeSubForSelect> getRoomTypeAllForSelect(boolean useCache)
			throws Exception {
		String hql = "select new cn.com.jy.hotel.domain.room.sub.RRoomTypeSubForSelect"
				+ "(id,roomTypeName) from RRoomType";

		Query query = this.getSession().createQuery(hql);

		return query.setCacheable(useCache).list();
	}
}
