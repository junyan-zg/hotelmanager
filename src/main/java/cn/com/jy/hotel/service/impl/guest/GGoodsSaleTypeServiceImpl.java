/**   
* @Title: GGoodsSaleTypeServiceImpl.java 
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
import cn.com.jy.hotel.dao.guest.GGoodsSaleTypeDao;
import cn.com.jy.hotel.domain.guest.GGoodsSaleType;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.guest.GGoodsSaleTypeService;

/** 
 * @ClassName: GGoodsSaleTypeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("gGoodsSaleTypeService")
public class GGoodsSaleTypeServiceImpl extends BaseServiceImpl<GGoodsSaleType> implements GGoodsSaleTypeService{

	@Resource
	private GGoodsSaleTypeDao gGoodsSaleTypeDao;
	
	@Override
	protected BaseDao<GGoodsSaleType> getBaseDao() {
		return gGoodsSaleTypeDao;
	}

}
