/**   
* @Title: GVipSub.java 
* @Package cn.com.jy.hotel.domain.guest.sub 
* @Description: TODO 
* @author zjy   
* @date 2016年5月7日 上午3:24:48 
* @version V1.0   
*/ 
package cn.com.jy.hotel.domain.guest.sub;

import java.math.BigDecimal;

import cn.com.jy.hotel.domain.guest.GVipType;

/** 
 * @ClassName: GVipSub 
 * @Description: TODO 
 * @author zjy
 * @date 2016年5月7日 上午3:24:48 
 *  
 */
public class GVipSub {
	private Long id;
	private GVipType GVipType;
	private String vipName;
	private BigDecimal blances;
	private String remark;
	private String vipIdCard;
	private byte status;
	private String vipPhone;
	private long points;
}
