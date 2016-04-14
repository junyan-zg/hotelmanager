/**   
* @Title: RBookroomServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RBookroomDao;
import cn.com.jy.hotel.domain.room.RBookroom;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RBookroomService;

/** 
 * @ClassName: RBookroomServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rBookroomService")
public class RBookroomServiceImpl extends BaseServiceImpl<RBookroom> implements RBookroomService{

	@Resource
	private RBookroomDao rBookroomDao;
	
	@Override
	protected BaseDao<RBookroom> getBaseDao() {
		return rBookroomDao;
	}

}
