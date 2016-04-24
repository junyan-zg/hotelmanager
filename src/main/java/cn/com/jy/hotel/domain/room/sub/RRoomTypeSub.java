/**   
* @Title: RRoomTypeSub.java 
* @Package cn.com.jy.hotel.domain.room.sub 
* @Description: TODO 
* @author zjy   
* @date 2016年4月24日 上午8:09:11 
* @version V1.0   
*/ 
package cn.com.jy.hotel.domain.room.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import cn.com.jy.hotel.domain.room.RRoomType;

/** 
 * @ClassName: RRoomTypeSub 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月24日 上午8:09:11 
 *  
 */
public class RRoomTypeSub implements Serializable{
	private Short id;
	private String roomTypeName;
	private short maxPeople;
	private String description;
	private BigDecimal deposit;
	public RRoomTypeSub(){}
	public RRoomTypeSub(Short id, String roomTypeName, short maxPeople,
			String description, BigDecimal deposit) {
		this.id = id;
		this.roomTypeName = roomTypeName;
		this.maxPeople = maxPeople;
		this.description = description;
		this.deposit = deposit;
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
	public short getMaxPeople() {
		return maxPeople;
	}
	public void setMaxPeople(short maxPeople) {
		this.maxPeople = maxPeople;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	
}
