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
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.room.RRoomDao;
import cn.com.jy.hotel.dao.room.RRoomGroupDao;
import cn.com.jy.hotel.data.RoomStatusMap;
import cn.com.jy.hotel.domain.PageResult;
import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.RRoomGroup;
import cn.com.jy.hotel.domain.room.sub.RRoomSub;
import cn.com.jy.hotel.domain.room.sub.RRoomSub2;
import cn.com.jy.hotel.service.guest.GGuestRoomDetailService;
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
public class RRoomServiceImpl extends BaseServiceImpl<RRoom> implements
		RRoomService {

	@Resource
	private RRoomDao rRoomDao;
	@Resource
	private GGuestRoomDetailService gGuestRoomDetailService;
	@Resource
	private RRoomGroupDao rRoomGroupDao;

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
		PageResult pageResult = new PageResult(pageNumber, pageSize,
				rRoomDao.getCountByGroupId(group_id, true));
		List<RRoom> list = getBaseDao().queryByConditions("RRoomGroup.id",
				new Serializable[] { group_id }, null, null,
				(int) pageResult.getLimitOffset(),
				(int) pageResult.getPageSize(), true);
		List<RRoomSub> rRoomSubs = new ArrayList<>();
		for (RRoom rRoom : list) {
			rRoomSubs.add(new RRoomSub(rRoom, group_id));
		}
		return rRoomSubs;
	}

	@Override
	public List<RRoomSub2> getRoomsByConditions(Set<Short> groupIds,
			Short typeId, Byte statusId, String roomNumber, Integer pageNumber,
			Integer pageSize) throws Exception {
		// 第一个参数由controller处理
		if (typeId != null && typeId == 0) {
			typeId = null;
		}
		if (roomNumber != null && "".equals(roomNumber.trim())) {
			roomNumber = null;
		}
		
		PageResult pageResult = new PageResult(pageNumber, pageSize,
				rRoomDao.getRoomsCountByConditions(groupIds, typeId, statusId,
						roomNumber, true));
		
		List<RRoom> rRooms = rRoomDao.getRoomsByConditions(groupIds, typeId,
				statusId, roomNumber, (int) pageResult.getLimitOffset(),
				(int) pageResult.getPageSize(), true);
		
		List<RRoomSub2> rRoomSub2s = new ArrayList<RRoomSub2>();
		for (RRoom rRoom : rRooms) {
			RRoomSub2 sub2 = new RRoomSub2();
			sub2.setId(rRoom.getId());
			sub2.setRoomNumber(rRoom.getRoomNumber());

			String status = RoomStatusMap.getString(rRoom.getRoomStatus());
			char[] charArray = status.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < charArray.length; i++) {
				if (i == charArray.length - 1) {
					sb.append(charArray[i]);
				} else {
					sb.append(charArray[i]);
					sb.append("<br/>");
				}
			}
			sub2.setRoomStatusName(sb.toString());

			sub2.setRoomTypeName(rRoom.getRRoomType().getRoomTypeName());
			sub2.setMaxPeople(rRoom.getRRoomType().getMaxPeople());

			String groupName = "";
			RRoomGroup rRoomGroup = rRoom.getRRoomGroup();
			groupName = rRoomGroup.getGroupName() + groupName;
			while (rRoomGroup.getParentId() != 0) {
				rRoomGroup = rRoomGroupDao.getById(rRoomGroup.getParentId());
				groupName = rRoomGroup.getGroupName() + "-" + groupName;
			}
			sub2.setGroupName(groupName);

			rRoomSub2s.add(sub2);
		}
		return rRoomSub2s;
	}

	@Override
	public Long getRoomsCountByConditions(Set<Short> groupIds, Short typeId,
			Byte statusId, String roomNumber, boolean useCache)
			throws Exception {
		// 第一个参数由controller处理
		if (typeId != null && typeId == 0) {
			typeId = null;
		}
		if (roomNumber != null && "".equals(roomNumber.trim())) {
			roomNumber = null;
		}
		return rRoomDao.getRoomsCountByConditions(groupIds, typeId, statusId,
				roomNumber, useCache);
	}

}
