/**   
* @Title: GVipSub.java 
* @Package cn.com.jy.hotel.domain.guest.sub 
* @Description: TODO 
* @author zjy   
* @date 2016年5月7日 上午3:24:48 
* @version V1.0   
*/ 
package cn.com.jy.hotel.domain.guest.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import cn.com.jy.hotel.domain.guest.GVipType;

/** 
 * @ClassName: GVipSub 
 * @Description: TODO 
 * @author zjy
 * @date 2016年5月7日 上午3:24:48 
 *  
 */
public class GVipSub implements Serializable{
	private Long id;
	private String vipTypeName;
	private String vipName;
	private BigDecimal blances;
	private String remark;
	private String vipIdCard;
	private String statusName;
	private String vipPhone;
	private long points;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVipTypeName() {
		return vipTypeName;
	}
	public void setVipTypeName(String vipTypeName) {
		this.vipTypeName = vipTypeName;
	}
	public String getVipName() {
		return vipName;
	}
	public void setVipName(String vipName) {
		this.vipName = vipName;
	}
	public BigDecimal getBlances() {
		return blances;
	}
	public void setBlances(BigDecimal blances) {
		this.blances = blances;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getVipIdCard() {
		return vipIdCard;
	}
	public void setVipIdCard(String vipIdCard) {
		this.vipIdCard = vipIdCard;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getVipPhone() {
		return vipPhone;
	}
	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public GVipSub(Long id, String vipTypeName, String vipName,
			BigDecimal blances, String remark, String vipIdCard,
			String statusName, String vipPhone, long points) {
		this.id = id;
		this.vipTypeName = vipTypeName;
		this.vipName = vipName;
		this.blances = blances;
		this.remark = remark;
		this.vipIdCard = vipIdCard;
		this.statusName = statusName;
		this.vipPhone = vipPhone;
		this.points = points;
	}
	public GVipSub(){}
}
