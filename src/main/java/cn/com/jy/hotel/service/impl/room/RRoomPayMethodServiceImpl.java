/**   
* @Title: RRoomPayMethodServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RRoomPayMethodDao;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomPayMethodService;

/** 
 * @ClassName: RRoomPayMethodServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rRoomPayMethodService")
public class RRoomPayMethodServiceImpl extends BaseServiceImpl<RRoomPayMethod> implements RRoomPayMethodService{

	@Resource
	private RRoomPayMethodDao rRoomPayMethodDao;
	
	@Override
	protected BaseDao<RRoomPayMethod> getBaseDao() {
		return rRoomPayMethodDao;
	}

}
