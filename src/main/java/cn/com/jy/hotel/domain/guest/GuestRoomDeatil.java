package cn.com.jy.hotel.domain.guest;

import java.util.Date;

/**
 * @ClassName: GuestRoomDeatil
 * @Description: 住客房间详情
 * @author zjy
 * @date 2016年4月2日 上午5:30:45
 * 
 */
public class GuestRoomDeatil {
	private Long id;
	/**
	 * 住宿表id
	 */
	private Long check_in_id;
	/**
	 * 房间表id
	 */
	private Integer room_id;
	/**
	 * 开始入住时间
	 */
	private Date startTime;
	/**
	 * 应该退房时间
	 */
	private Date endTime;
	/**
	 * 实际退房时间
	 */
	private Date actuallyEndTime;
	/**
	 * 付费方案id
	 */
	private Short payMethod_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCheck_in_id() {
		return check_in_id;
	}

	public void setCheck_in_id(Long check_in_id) {
		this.check_in_id = check_in_id;
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getActuallyEndTime() {
		return actuallyEndTime;
	}

	public void setActuallyEndTime(Date actuallyEndTime) {
		this.actuallyEndTime = actuallyEndTime;
	}

	public Short getPayMethod_id() {
		return payMethod_id;
	}

	public void setPayMethod_id(Short payMethod_id) {
		this.payMethod_id = payMethod_id;
	}
}