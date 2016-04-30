/**   
* @Title: RoomPayMethodSub2.java 
* @Package cn.com.jy.hotel.domain.room.sub 
* @Description: TODO 
* @author zjy   
* @date 2016年4月29日 下午11:05:37 
* @version V1.0   
*/ 
package cn.com.jy.hotel.domain.room.sub;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import cn.com.jy.hotel.data.RoomPayMethodStatusMap;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;

/** 
 * @ClassName: RoomPayMethodSub2 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月29日 下午11:05:37 
 *  
 */
public class RoomPayMethodSub2 implements Serializable{
	private Short id;
	private String roomTypeName;//房间类型名称
	private String payMethodName;//方案名称（如状态为已删则要在方案名称加上(已删+时间戳)
	private String statusName;//方案状态（0正常使用1停用2删除）
	private Byte payType = (byte)1;
	private String checkInTime;//入住时间（当天某个时间点）
	private String checkOutTime;//退房时间（明天某个时间点）
	private BigDecimal dayPrice;//日总价
	public RoomPayMethodSub2(){
		
	}
	public RoomPayMethodSub2(RRoomPayMethod rRoomPayMethod){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		this.id = rRoomPayMethod.getId();
		this.roomTypeName = rRoomPayMethod.getRRoomType().getRoomTypeName();
		this.payMethodName = rRoomPayMethod.getPayMethodName();
		this.statusName = RoomPayMethodStatusMap.getString(rRoomPayMethod.getStatus());
		this.payType = rRoomPayMethod.getPayType();
		this.checkInTime = sdf.format(rRoomPayMethod.getCheckInTime());
		this.dayPrice = rRoomPayMethod.getDayPrice();
		this.checkOutTime = sdf.format(rRoomPayMethod.getCheckOutTime());
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
	public String getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	public String getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public BigDecimal getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(BigDecimal dayPrice) {
		this.dayPrice = dayPrice;
	}
}
