/**   
 * @Title: RRoomServiceImpl.java 
 * @Package cn.com.jy.hotel.service.impl.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月14日 上午10:41:35 
 * @version V1.0   
 */
package cn.com.jy.hotel.service.impl.room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.room.RRoomDao;
import cn.com.jy.hotel.domain.PageResult;
import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.sub.RRoomSub;
import cn.com.jy.hotel.domain.room.sub.RRoomSub2;
import cn.com.jy.hotel.service.guest.GGuestRoomDetailService;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomGroupService;
import cn.com.jy.hotel.service.room.RRoomService;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/**
 * @ClassName: RRoomServiceImpl
 * @Description: TODO
 * @author zjy
 * @date 2016年4月14日 上午10:41:35
 * 
 */
@Service("rRoomService")
public class RRoomServiceImpl extends BaseServiceImpl<RRoom> implements
		RRoomService {

	@Resource
	private RRoomDao rRoomDao;
	@Resource
	private GGuestRoomDetailService gGuestRoomDetailService;
	@Resource
	private RRoomTypeService rRoomTypeService;
	@Resource
	private RRoomGroupService rRoomGroupService;
	

	@Override
	protected BaseDao<RRoom> getBaseDao() {
		return rRoomDao;
	}

	@Override
	public Long getCountByGroupId(Short group_id, boolean useCache)
			throws Exception {

		return rRoomDao.getCountByGroupId(group_id, useCache);
	}

	@Override
	public List<RRoomSub> getRoomAllByPages(Short group_id, Integer pageNumber,
			Integer pageSize) throws Exception {
		PageResult pageResult = new PageResult(pageNumber,
				pageSize, rRoomDao.getCountByGroupId(group_id, true));
		List<RRoom> list = getBaseDao().queryByConditions("RRoomGroup.id", new Serializable[]{ group_id}, null, null,
				(int) pageResult.getLimitOffset(),
				(int) pageResult.getPageSize(), true);
		List<RRoomSub> rRoomSubs = new ArrayList<>();
		for (RRoom rRoom : list) {
			rRoomSubs.add(new RRoomSub(rRoom,group_id));
		}
		return rRoomSubs;
	}

	@Override
	public List<RRoomSub2> getRoomsByConditions(Short groupId, Short typeId,
			Byte statusId, String roomNumber) throws Exception {
		return null;
	}

}
