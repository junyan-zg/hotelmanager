/**   
* @Title: RBlackListDaoImpl.java 
* @Package cn.com.jy.hotel.dao.impl.room
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:15:2 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.impl.room;

import org.springframework.stereotype.Repository;

import cn.com.jy.hotel.dao.impl.BaseDaoImpl;
import cn.com.jy.hotel.dao.room.RBlackListDao;
import cn.com.jy.hotel.domain.room.RBlackList;

/** 
 * @ClassName: RBlackListDaoImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:15:2 
 *  
 */
@Repository("rBlackListDao")
public class RBlackListDaoImpl extends BaseDaoImpl<RBlackList> implements RBlackListDao{

}
