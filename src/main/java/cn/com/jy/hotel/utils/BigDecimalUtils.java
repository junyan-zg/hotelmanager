/**   
* @Title: BigDecimalUtils.java 
* @Package cn.com.jy.hotel.utils 
* @Description: TODO 
* @author zjy   
* @date 2016年4月3日 上午4:28:45 
* @version V1.0   
*/ 
package cn.com.jy.hotel.utils;

import java.math.BigDecimal;

/** 
 * @ClassName: BigDecimalUtils 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月3日 上午4:28:45 
 *  
 */
public class BigDecimalUtils {
	//ROUND_HALF_UP: 遇到.5的情况时往上近似,例: 1.5 ->;2
	//ROUND_HALF_DOWN : 遇到.5的情况时往下近似,例: 1.5 ->;1
	
	/**
	 * 保留两位小数
	 */
	public static BigDecimal deal(BigDecimal number){
		return number.setScale(2,BigDecimal.ROUND_HALF_UP);
	}
}
