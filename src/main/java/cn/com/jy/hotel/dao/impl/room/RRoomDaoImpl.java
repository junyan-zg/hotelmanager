/**   
 * @Title: RRoomDaoImpl.java 
 * @Package cn.com.jy.hotel.dao.impl.room
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月15日 上午6:15:2 
 * @version V1.0   
 */
package cn.com.jy.hotel.dao.impl.room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.proxy.pojo.javassist.SerializableProxy;
import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RRoomDao;
import cn.com.jy.hotel.domain.room.RRoom;

/**
 * @ClassName: RRoomDaoImpl
 * @Description: TODO
 * @author zjy
 * @date 2016年4月15日 上午6:15:2
 * 
 */
@Repository("rRoomDao")
public class RRoomDaoImpl extends BaseDaoImpl<RRoom> implements RRoomDao {

	@Override
	public Long getCountByGroupId(Short group_id,boolean useCache) throws Exception {
		String hql = "select count(id) from RRoom where RRoomGroup.id = ?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, group_id);
		return (long) query.setCacheable(useCache).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RRoom> getRoomsByConditions(Set<Short> groupIds, Short typeId,
			Byte statusId, String roomNumber,boolean useCache) throws Exception {
		List<Serializable> args = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		sb.append("from RRoom ");
		int flag = 0;
		if(groupIds!=null&&groupIds.size()>0){
			sb.append("where RRoomGroup.id in (");
			flag = 1;
			Iterator<Short> iterator = groupIds.iterator();
			for (int i = 0; i < groupIds.size(); i++) {
				if (i == groupIds.size() - 1) {
					sb.append("?");
				} else {
					sb.append("?,");
				}
				args.add(iterator.next());
			}
			sb.append(")");
		}
		if(typeId != null){
			if (flag==0) {
				sb.append("where RRoomType.id = ?");
				flag = 1;
			}else {
				sb.append(" and RRoomType.id = ?");
			}
			args.add(typeId);
		}
		if(statusId != null){
			if (flag==0) {
				sb.append("where roomStatus = ?");
				flag = 1;
			}else {
				sb.append(" and roomStatus = ?");
			}
			args.add(statusId);
		}
		if(roomNumber != null){
			if (flag==0) {
				sb.append("where roomNumber = ?");
				//flag = 1;没意义了
			}else {
				sb.append(" and roomNumber = ?");
			}
			args.add(roomNumber);
		}
		Query query = this.getSession().createQuery(sb.toString());
		for (int i = 0; i < args.size(); i++) {
			query.setParameter(i, args.get(i));
		}
		return query.setCacheable(useCache).list();
	}
}