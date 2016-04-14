/**   
* @Title: RBookroomTypeServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RBookroomTypeDao;
import cn.com.jy.hotel.domain.room.RBookroomType;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RBookroomTypeService;

/** 
 * @ClassName: RBookroomTypeServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rBookroomTypeService")
public class RBookroomTypeServiceImpl extends BaseServiceImpl<RBookroomType> implements RBookroomTypeService{

	@Resource
	private RBookroomTypeDao rBookroomTypeDao;
	
	@Override
	protected BaseDao<RBookroomType> getBaseDao() {
		return rBookroomTypeDao;
	}

}
