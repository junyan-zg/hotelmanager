/**   
* @Title: SysVariableServiceImpl.java 
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
import cn.com.jy.hotel.dao.system.SysVariableDao;
import cn.com.jy.hotel.domain.system.SysVariable;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.system.SysVariableService;

/** 
 * @ClassName: SysVariableServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("sysVariableService")
public class SysVariableServiceImpl extends BaseServiceImpl<SysVariable> implements SysVariableService{

	@Resource
	private SysVariableDao sysVariableDao;
	
	@Override
	protected BaseDao<SysVariable> getBaseDao() {
		return sysVariableDao;
	}

}
