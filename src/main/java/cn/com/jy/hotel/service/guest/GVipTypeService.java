/**   
* @Title: GVipTypeService.java 
* @Package cn.com.jy.hotel.service.guest 
* @Description: TODO 
* @author zjy   
* @date 2016年4月15日 上午6:17:36 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.guest;

import java.util.List;

import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.domain.guest.sub.GVipTypeSub;
import cn.com.jy.hotel.service.BaseService;

/** 
 * @ClassName: GVipTypeService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月15日 上午6:17:36 
 *  
 */
public interface GVipTypeService extends BaseService<GVipType>{
	public List<GVipTypeSub> getByPages(Integer pageNumber,Integer pageSize) throws Exception;
}
