/**   
* @Title: GGuestDetailServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GGuestDetailDao;
import cn.com.jy.hotel.domain.guest.GGuestDetail;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GGuestDetailService;

/** 
 * @ClassName: GGuestDetailServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gGuestDetailService")
public class GGuestDetailServiceImpl extends BaseServiceImpl<GGuestDetail> implements GGuestDetailService{

	@Resource
	private GGuestDetailDao gGuestDetailDao;
	
	@Override
	protected BaseDao<GGuestDetail> getBaseDao() {
		return gGuestDetailDao;
	}

}
