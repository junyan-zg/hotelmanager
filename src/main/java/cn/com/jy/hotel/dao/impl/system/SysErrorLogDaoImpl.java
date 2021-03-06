/**   
* @Title: SysErrorLogDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.system
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.system;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.system.SysErrorLogDao;
import cn.com.jy.hotel.domain.system.SysErrorLog;

/** 
 * @ClassName: SysErrorLogDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("sysErrorLogDao")
public class SysErrorLogDaoImpl extends BaseDaoImpl<SysErrorLog> implements SysErrorLogDao{

}
