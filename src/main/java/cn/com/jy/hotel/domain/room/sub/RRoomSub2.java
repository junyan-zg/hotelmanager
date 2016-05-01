/**   
 * @Title: RRoomSub.java 
 * @Package cn.com.jy.hotel.domain.room.sub 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月29日 下午2:31:38 
 * @version V1.0   
 */
package cn.com.jy.hotel.domain.room.sub;

import java.io.Serializable;

import cn.com.jy.hotel.data.RoomStatusMap;
import cn.com.jy.hotel.domain.room.RRoom;

/**
 * @ClassName: RRoomSub
 * @Description: TODO
 * @author zjy
 * @date 2016年4月29日 下午2:31:38
 * 
 */
public class RRoomSub2 implements Serializable{
	private Integer id;
	private String groupName;//由根到直接节点
	private String roomNumber;//房间号
	private String roomTypeName;//房间类型
	private String roomStatusName;//房间状态
	private String guestName;
	private String tips;
	private short maxPeople;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public short getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(short maxPeople) {
		this.maxPeople = maxPeople;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getRoomStatusName() {
		return roomStatusName;
	}

	public void setRoomStatusName(String roomStatusName) {
		this.roomStatusName = roomStatusName;
	}

	public RRoomSub2() {
	}

}
