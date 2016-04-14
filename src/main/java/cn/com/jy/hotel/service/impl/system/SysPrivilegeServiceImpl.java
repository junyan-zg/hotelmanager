/**   
* @Title: SysPrivilegeServiceImpl.java 
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
import cn.com.jy.hotel.dao.system.SysPrivilegeDao;
import cn.com.jy.hotel.domain.system.SysPrivilege;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.system.SysPrivilegeService;

/** 
 * @ClassName: SysPrivilegeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("sysPrivilegeService")
public class SysPrivilegeServiceImpl extends BaseServiceImpl<SysPrivilege> implements SysPrivilegeService{

	@Resource
	private SysPrivilegeDao sysPrivilegeDao;
	
	@Override
	protected BaseDao<SysPrivilege> getBaseDao() {
		return sysPrivilegeDao;
	}

}
