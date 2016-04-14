/**   
* @Title: SysOperatorLogServiceImpl.java 
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
import cn.com.jy.hotel.dao.system.SysOperatorLogDao;
import cn.com.jy.hotel.domain.system.SysOperatorLog;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.system.SysOperatorLogService;

/** 
 * @ClassName: SysOperatorLogServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("sysOperatorLogService")
public class SysOperatorLogServiceImpl extends BaseServiceImpl<SysOperatorLog> implements SysOperatorLogService{

	@Resource
	private SysOperatorLogDao sysOperatorLogDao;
	
	@Override
	protected BaseDao<SysOperatorLog> getBaseDao() {
		return sysOperatorLogDao;
	}

}
