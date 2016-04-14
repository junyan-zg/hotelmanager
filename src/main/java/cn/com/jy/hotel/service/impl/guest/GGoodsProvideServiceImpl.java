/**   
* @Title: GGoodsProvideServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GGoodsProvideDao;
import cn.com.jy.hotel.domain.guest.GGoodsProvide;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GGoodsProvideService;

/** 
 * @ClassName: GGoodsProvideServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gGoodsProvideService")
public class GGoodsProvideServiceImpl extends BaseServiceImpl<GGoodsProvide> implements GGoodsProvideService{

	@Resource
	private GGoodsProvideDao gGoodsProvideDao;
	
	@Override
	protected BaseDao<GGoodsProvide> getBaseDao() {
		return gGoodsProvideDao;
	}

}
