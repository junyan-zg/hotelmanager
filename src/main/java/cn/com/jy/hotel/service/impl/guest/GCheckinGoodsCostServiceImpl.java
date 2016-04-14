/**   
* @Title: GCheckinGoodsCostServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GCheckinGoodsCostDao;
import cn.com.jy.hotel.domain.guest.GCheckinGoodsCost;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GCheckinGoodsCostService;

/** 
 * @ClassName: GCheckinGoodsCostServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gCheckinGoodsCostService")
public class GCheckinGoodsCostServiceImpl extends BaseServiceImpl<GCheckinGoodsCost> implements GCheckinGoodsCostService{

	@Resource
	private GCheckinGoodsCostDao gCheckinGoodsCostDao;
	
	@Override
	protected BaseDao<GCheckinGoodsCost> getBaseDao() {
		return gCheckinGoodsCostDao;
	}

}
