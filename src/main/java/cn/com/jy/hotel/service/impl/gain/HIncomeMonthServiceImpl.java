/**   
* @Title: HIncomeMonthServiceImpl.java 
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
import cn.com.jy.hotel.dao.gain.HIncomeMonthDao;
import cn.com.jy.hotel.domain.gain.HIncomeMonth;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.gain.HIncomeMonthService;

/** 
 * @ClassName: HIncomeMonthServiceImpl 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:41:35 
 *  
 */
@Service("hIncomeMonthService")
public class HIncomeMonthServiceImpl extends BaseServiceImpl<HIncomeMonth> implements HIncomeMonthService{

	@Resource
	private HIncomeMonthDao hIncomeMonthDao;
	
	@Override
	protected BaseDao<HIncomeMonth> getBaseDao() {
		return hIncomeMonthDao;
	}

}
