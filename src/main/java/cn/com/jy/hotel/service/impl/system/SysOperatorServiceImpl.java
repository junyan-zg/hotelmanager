/**   
* @Title: SysOperatorServiceImpl.java 
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
import cn.com.jy.hotel.dao.system.SysOperatorDao;
import cn.com.jy.hotel.domain.system.SysOperator;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.system.SysOperatorService;

/** 
 * @ClassName: SysOperatorServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("sysOperatorService")
public class SysOperatorServiceImpl extends BaseServiceImpl<SysOperator> implements SysOperatorService{

	@Resource
	private SysOperatorDao sysOperatorDao;
	
	@Override
	protected BaseDao<SysOperator> getBaseDao() {
		return sysOperatorDao;
	}

}
