/**   
* @Title: RIdentifyCodeServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RIdentifyCodeDao;
import cn.com.jy.hotel.domain.room.RIdentifyCode;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RIdentifyCodeService;

/** 
 * @ClassName: RIdentifyCodeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rIdentifyCodeService")
public class RIdentifyCodeServiceImpl extends BaseServiceImpl<RIdentifyCode> implements RIdentifyCodeService{

	@Resource
	private RIdentifyCodeDao rIdentifyCodeDao;
	
	@Override
	protected BaseDao<RIdentifyCode> getBaseDao() {
		return rIdentifyCodeDao;
	}

}
