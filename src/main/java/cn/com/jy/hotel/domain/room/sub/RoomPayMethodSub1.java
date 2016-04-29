/**   
* @Title: RoomPayMethodSub1.java 
* @Package cn.com.jy.hotel.domain.room.sub 
* @Description: TODO 
* @author zjy   
* @date 2016年4月29日 下午11:05:14 
* @version V1.0   
*/ 
package cn.com.jy.hotel.domain.room.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import cn.com.jy.hotel.data.RoomPayMethodStatusMap;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;

/** 
 * @ClassName: RoomPayMethodSub1 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月29日 下午11:05:14 
 *  
 */
public class RoomPayMethodSub1 implements Serializable{
	private Short id;
	private String roomTypeName;//房间类型名称
	private String payMethodName;//方案名称（如状态为已删则要在方案名称加上(已删+时间戳)
	private Integer startupTime;//起步时间单位分钟
	private BigDecimal startupPrice;//起步价钱单位元
	private Integer standardTime;//标准计费时间:过起步时间后按此时间计算,单位分钟
	private BigDecimal standardPrice;//标准计费金额
	private Integer minTime;//最小计费时间
	private BigDecimal minPrice;//最小计费金额
	private String statusName;//方案状态（0正常使用1停用2删除）
	private Byte payType = (byte)0;
	public RoomPayMethodSub1(){}
	public RoomPayMethodSub1(RRoomPayMethod rRoomPayMethod){
		this.id = rRoomPayMethod.getId();
		this.roomTypeName = rRoomPayMethod.getRRoomType().getRoomTypeName();
		this.payMethodName = rRoomPayMethod.getPayMethodName();
		this.standardTime = rRoomPayMethod.getStandardTime();
		this.standardPrice = rRoomPayMethod.getStandardPrice();
		this.statusName = RoomPayMethodStatusMap.getString(rRoomPayMethod.getStatus());
		this.minPrice = rRoomPayMethod.getMinPrice();
		this.minTime = rRoomPayMethod.getMinTime();
		this.startupPrice = rRoomPayMethod.getStandardPrice();
		this.startupTime = rRoomPayMethod.getStartupTime();
		this.payType = rRoomPayMethod.getPayType();
	}
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public String getPayMethodName() {
		return payMethodName;
	}
	public void setPayMethodName(String payMethodName) {
		this.payMethodName = payMethodName;
	}
	public Integer getStartupTime() {
		return startupTime;
	}
	public void setStartupTime(Integer startupTime) {
		this.startupTime = startupTime;
	}
	public BigDecimal getStartupPrice() {
		return startupPrice;
	}
	public void setStartupPrice(BigDecimal startupPrice) {
		this.startupPrice = startupPrice;
	}
	public Integer getStandardTime() {
		return standardTime;
	}
	public void setStandardTime(Integer standardTime) {
		this.standardTime = standardTime;
	}
	public BigDecimal getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(BigDecimal standardPrice) {
		this.standardPrice = standardPrice;
	}
	public Integer getMinTime() {
		return minTime;
	}
	public void setMinTime(Integer minTime) {
		this.minTime = minTime;
	}
	public BigDecimal getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Byte getPayType() {
		return payType;
	}
	public void setPayType(Byte payType) {
		this.payType = payType;
	}
}
