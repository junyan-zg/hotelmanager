/**   
* @Title: GGuestRoomDetailServiceImpl.java 
* @Package cn.com.jy.hotel.service.impl.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:41:35 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.impl.guest;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.guest.GGuestRoomDetailDao;
import cn.com.jy.hotel.domain.guest.GGuestRoomDetail;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GGuestRoomDetailService;

/** 
 * @ClassName: GGuestRoomDetailServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gGuestRoomDetailService")
public class GGuestRoomDetailServiceImpl extends BaseServiceImpl<GGuestRoomDetail> implements GGuestRoomDetailService{

	@Resource
	private GGuestRoomDetailDao gGuestRoomDetailDao;
	
	@Override
	protected BaseDao<GGuestRoomDetail> getBaseDao() {
		return gGuestRoomDetailDao;
	}

}
