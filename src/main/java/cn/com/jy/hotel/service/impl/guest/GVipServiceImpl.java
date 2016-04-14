/**   
* @Title: GVipServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GVipDao;
import cn.com.jy.hotel.domain.guest.GVip;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GVipService;

/** 
 * @ClassName: GVipServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gVipService")
public class GVipServiceImpl extends BaseServiceImpl<GVip> implements GVipService{

	@Resource
	private GVipDao gVipDao;
	
	@Override
	protected BaseDao<GVip> getBaseDao() {
		return gVipDao;
	}

}
