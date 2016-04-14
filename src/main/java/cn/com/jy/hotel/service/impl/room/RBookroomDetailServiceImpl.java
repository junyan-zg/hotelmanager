/**   
* @Title: RBookroomDetailServiceImpl.java 
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
import cn.com.jy.hotel.dao.room.RBookroomDetailDao;
import cn.com.jy.hotel.domain.room.RBookroomDetail;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RBookroomDetailService;

/** 
 * @ClassName: RBookroomDetailServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("rBookroomDetailService")
public class RBookroomDetailServiceImpl extends BaseServiceImpl<RBookroomDetail> implements RBookroomDetailService{

	@Resource
	private RBookroomDetailDao rBookroomDetailDao;
	
	@Override
	protected BaseDao<RBookroomDetail> getBaseDao() {
		return rBookroomDetailDao;
	}

}
