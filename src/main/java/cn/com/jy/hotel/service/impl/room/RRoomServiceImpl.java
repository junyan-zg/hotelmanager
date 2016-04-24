/**   
* @Title: RRoomServiceImpl.java 
* @Package cn.com.jy.hotel.service.impl.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:41:35 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.impl.room;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.room.RRoomDao;
import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomService;

/** 
 * @ClassName: RRoomServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rRoomService")
public class RRoomServiceImpl extends BaseServiceImpl<RRoom> implements RRoomService{

	@Resource
	private RRoomDao rRoomDao;
	
	@Override
	protected BaseDao<RRoom> getBaseDao() {
		return rRoomDao;
	}

	@Override
	public Long getCountByGroupId(Short group_id,boolean useCache) throws Exception {
	
		return rRoomDao.getCountByGroupId(group_id,useCache);
	}

}
