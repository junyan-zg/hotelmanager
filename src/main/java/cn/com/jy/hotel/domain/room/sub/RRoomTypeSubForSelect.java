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
public class RRoomTypeSubForSelect implements Serializable{
	private Short id;
	private String roomTypeName;
	public RRoomTypeSubForSelect(){}
	public RRoomTypeSubForSelect(Short id, String roomTypeName) {
		this.id = id;
		this.roomTypeName = roomTypeName;
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
}
