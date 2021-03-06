/**   
* @Title: SysOperatorDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.system
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.system;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.system.SysOperatorDao;
import cn.com.jy.hotel.domain.system.SysOperator;

/** 
 * @ClassName: SysOperatorDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("sysOperatorDao")
public class SysOperatorDaoImpl extends BaseDaoImpl<SysOperator> implements SysOperatorDao{

}
