/**   
* @Title: GCheckInServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GCheckInDao;
import cn.com.jy.hotel.domain.guest.GCheckIn;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GCheckInService;

/** 
 * @ClassName: GCheckInServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gCheckInService")
public class GCheckInServiceImpl extends BaseServiceImpl<GCheckIn> implements GCheckInService{

	@Resource
	private GCheckInDao gCheckInDao;
	
	@Override
	protected BaseDao<GCheckIn> getBaseDao() {
		return gCheckInDao;
	}

}
