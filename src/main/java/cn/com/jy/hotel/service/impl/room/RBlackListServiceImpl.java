/**   
* @Title: RBlackListServiceImpl.java 
* @Package cn.com.jy.hotel.service.impl.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:41:35 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.impl.room;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.room.RBlackListDao;
import cn.com.jy.hotel.domain.room.RBlackList;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RBlackListService;

/** 
 * @ClassName: RBlackListServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rBlackListService")
public class RBlackListServiceImpl extends BaseServiceImpl<RBlackList> implements RBlackListService{

	@Resource
	private RBlackListDao rBlackListDao;
	
	@Override
	protected BaseDao<RBlackList> getBaseDao() {
		return rBlackListDao;
	}

}
