/**   
* @Title: GGoodsSaleServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GGoodsSaleDao;
import cn.com.jy.hotel.domain.guest.GGoodsSale;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GGoodsSaleService;

/** 
 * @ClassName: GGoodsSaleServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gGoodsSaleService")
public class GGoodsSaleServiceImpl extends BaseServiceImpl<GGoodsSale> implements GGoodsSaleService{

	@Resource
	private GGoodsSaleDao gGoodsSaleDao;
	
	@Override
	protected BaseDao<GGoodsSale> getBaseDao() {
		return gGoodsSaleDao;
	}

}
