/**   
* @Title: HIncomeDayServiceImpl.java 
* @Package cn.com.jy.hotel.service.impl.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:41:35 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service.impl.gain;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.gain.HIncomeDayDao;
import cn.com.jy.hotel.domain.gain.HIncomeDay;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.gain.HIncomeDayService;

/** 
 * @ClassName: HIncomeDayServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("hIncomeDayService")
public class HIncomeDayServiceImpl extends BaseServiceImpl<HIncomeDay> implements HIncomeDayService{

	@Resource
	private HIncomeDayDao hIncomeDayDao;
	
	@Override
	protected BaseDao<HIncomeDay> getBaseDao() {
		return hIncomeDayDao;
	}

}
