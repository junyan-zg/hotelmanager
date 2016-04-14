/**   
* @Title: GVipTypeServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GVipTypeDao;
import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GVipTypeService;

/** 
 * @ClassName: GVipTypeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gVipTypeService")
public class GVipTypeServiceImpl extends BaseServiceImpl<GVipType> implements GVipTypeService{

	@Resource
	private GVipTypeDao gVipTypeDao;
	
	@Override
	protected BaseDao<GVipType> getBaseDao() {
		return gVipTypeDao;
	}

}
