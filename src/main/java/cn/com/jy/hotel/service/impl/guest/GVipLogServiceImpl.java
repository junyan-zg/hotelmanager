/**   
* @Title: GVipLogServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GVipLogDao;
import cn.com.jy.hotel.domain.guest.GVipLog;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GVipLogService;

/** 
 * @ClassName: GVipLogServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gVipLogService")
public class GVipLogServiceImpl extends BaseServiceImpl<GVipLog> implements GVipLogService{

	@Resource
	private GVipLogDao gVipLogDao;
	
	@Override
	protected BaseDao<GVipLog> getBaseDao() {
		return gVipLogDao;
	}

}
