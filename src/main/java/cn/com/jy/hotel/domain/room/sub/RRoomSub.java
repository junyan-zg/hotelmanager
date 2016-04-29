/**   
 * @Title: RRoomSub.java 
 * @Package cn.com.jy.hotel.domain.room.sub 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月29日 下午2:31:38 
 * @version V1.0   
 */
package cn.com.jy.hotel.domain.room.sub;

import cn.com.jy.hotel.data.RoomStatusMap;
import cn.com.jy.hotel.domain.room.RRoom;

/**
 * @ClassName: RRoomSub
 * @Description: TODO
 * @author zjy
 * @date 2016年4月29日 下午2:31:38
 * 
 */
public class RRoomSub {
	private Integer id;
	private Short group_id;
	private String roomNumber;
	private String roomTypeName;
	private String roomStatusName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Short group_id) {
		this.group_id = group_id;
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

	public RRoomSub() {
	}

	public RRoomSub(RRoom room, Short group_id) {
		this.id = room.getId();
		this.group_id = group_id;
		this.roomNumber = room.getRoomNumber();
		this.roomTypeName = room.getRRoomType().getRoomTypeName();
		this.roomStatusName = RoomStatusMap.getString(room.getRoomStatus());
	}
}
