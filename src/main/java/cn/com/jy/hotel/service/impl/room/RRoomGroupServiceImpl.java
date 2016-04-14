/**   
* @Title: RRoomGroupServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RRoomGroupDao;
import cn.com.jy.hotel.domain.room.RRoomGroup;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomGroupService;

/** 
 * @ClassName: RRoomGroupServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rRoomGroupService")
public class RRoomGroupServiceImpl extends BaseServiceImpl<RRoomGroup> implements RRoomGroupService{

	@Resource
	private RRoomGroupDao rRoomGroupDao;
	
	@Override
	protected BaseDao<RRoomGroup> getBaseDao() {
		return rRoomGroupDao;
	}

}
