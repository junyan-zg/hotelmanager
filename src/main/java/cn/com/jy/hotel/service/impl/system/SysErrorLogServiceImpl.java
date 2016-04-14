/**   
* @Title: SysErrorLogServiceImpl.java 
* @Package cn.com.jy.hotel.service.impl.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:41:35 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.impl.system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.system.SysErrorLogDao;
import cn.com.jy.hotel.domain.system.SysErrorLog;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.system.SysErrorLogService;

/** 
 * @ClassName: SysErrorLogServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("sysErrorLogService")
public class SysErrorLogServiceImpl extends BaseServiceImpl<SysErrorLog> implements SysErrorLogService{

	@Resource
	private SysErrorLogDao sysErrorLogDao;
	
	@Override
	protected BaseDao<SysErrorLog> getBaseDao() {
		return sysErrorLogDao;
	}

}
