/**   
 * @Title: RRoomPayMethodServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RRoomPayMethodDao;
import cn.com.jy.hotel.domain.PageResult;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;
import cn.com.jy.hotel.domain.room.sub.RRoomSub;
import cn.com.jy.hotel.domain.room.sub.RoomPayMethodSub1;
import cn.com.jy.hotel.domain.room.sub.RoomPayMethodSub2;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomPayMethodService;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/**
 * @ClassName: RRoomPayMethodServiceImpl
 * @Description: TODO
 * @author zjy
 * @date 2016年4月14日 上午10:41:35
 * 
 */
@Service("rRoomPayMethodService")
public class RRoomPayMethodServiceImpl extends BaseServiceImpl<RRoomPayMethod>
		implements RRoomPayMethodService {

	@Resource
	private RRoomPayMethodDao rRoomPayMethodDao;

	@Override
	protected BaseDao<RRoomPayMethod> getBaseDao() {
		return rRoomPayMethodDao;
	}

	@Override
	public Long getRoomPayMethodCount(Byte payType, boolean useCache)
			throws Exception {
		return rRoomPayMethodDao.getRoomPayMethodCount(payType, useCache);
	}

	@Override
	public List<?> getRoomPayMethodAllByPages(Byte payType, Integer pageNumber,
			Integer pageSize, boolean useCache) throws Exception {

		Long count = rRoomPayMethodDao.getRoomPayMethodCount(payType, useCache);

		PageResult pageResult = new PageResult(pageNumber, pageSize, count);

		List<RRoomPayMethod> rRoomPayMethods = getBaseDao().queryByConditions(
				"status != 2 and payType",
				new Serializable[] { payType }, null, null,
				(int) pageResult.getLimitOffset(),
				(int) pageResult.getPageSize(), useCache);
		List<RoomPayMethodSub1> list1 = null;
		List<RoomPayMethodSub2> list2 = null;
		if (payType == (byte) 0) {
			list1 = new ArrayList<>();
			for (RRoomPayMethod rRoomPayMethod : rRoomPayMethods) {
				list1.add(new RoomPayMethodSub1(rRoomPayMethod));
			}
			return list1;
		} else {
			list2 = new ArrayList<>();
			for (RRoomPayMethod rRoomPayMethod : rRoomPayMethods) {
				list2.add(new RoomPayMethodSub2(rRoomPayMethod));
			}
			return list2;
		}
	}

}
