/**   
* @Title: RRoomTypeServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RRoomTypeDao;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/** 
 * @ClassName: RRoomTypeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rRoomTypeService")
public class RRoomTypeServiceImpl extends BaseServiceImpl<RRoomType> implements RRoomTypeService{

	@Resource
	private RRoomTypeDao rRoomTypeDao;
	
	@Override
	protected BaseDao<RRoomType> getBaseDao() {
		return rRoomTypeDao;
	}

}
