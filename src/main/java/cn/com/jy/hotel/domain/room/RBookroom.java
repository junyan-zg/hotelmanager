package cn.com.jy.hotel.domain.room;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RBookroom generated by hbm2java
 */
@Entity
@Table(name = "r_bookroom", catalog = "hotel")
public class RBookroom implements java.io.Serializable {

	private Long id;
	private String phoneCall;
	private String phoneRemain;
	private byte billStatus;
	private byte guestStatus;
	private Date bookStartTime;
	private Date bookEndTime;
	private Long vipId;
	private String guestName;
	private String ipAddress;
	private String remark;
	private Set<RBookroomType> RBookroomTypes = new HashSet<RBookroomType>(0);

	public RBookroom() {
	}

	public RBookroom(byte billStatus, byte guestStatus) {
		this.billStatus = billStatus;
		this.guestStatus = guestStatus;
	}

	public RBookroom(String phoneCall, String phoneRemain, byte billStatus,
			byte guestStatus, Date bookStartTime, Date bookEndTime, Long vipId,
			String guestName, String ipAddress, String remark,
			Set<RBookroomType> RBookroomTypes) {
		this.phoneCall = phoneCall;
		this.phoneRemain = phoneRemain;
		this.billStatus = billStatus;
		this.guestStatus = guestStatus;
		this.bookStartTime = bookStartTime;
		this.bookEndTime = bookEndTime;
		this.vipId = vipId;
		this.guestName = guestName;
		this.ipAddress = ipAddress;
		this.remark = remark;
		this.RBookroomTypes = RBookroomTypes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "phone_call", length = 11)
	public String getPhoneCall() {
		return this.phoneCall;
	}

	public void setPhoneCall(String phoneCall) {
		this.phoneCall = phoneCall;
	}

	@Column(name = "phone_remain", length = 11)
	public String getPhoneRemain() {
		return this.phoneRemain;
	}

	public void setPhoneRemain(String phoneRemain) {
		this.phoneRemain = phoneRemain;
	}

	@Column(name = "bill_status", nullable = false)
	public byte getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(byte billStatus) {
		this.billStatus = billStatus;
	}

	@Column(name = "guest_status", nullable = false)
	public byte getGuestStatus() {
		return this.guestStatus;
	}

	public void setGuestStatus(byte guestStatus) {
		this.guestStatus = guestStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "book_startTime", length = 19)
	public Date getBookStartTime() {
		return this.bookStartTime;
	}

	public void setBookStartTime(Date bookStartTime) {
		this.bookStartTime = bookStartTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "book_endTime", length = 19)
	public Date getBookEndTime() {
		return this.bookEndTime;
	}

	public void setBookEndTime(Date bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	@Column(name = "vip_id")
	public Long getVipId() {
		return this.vipId;
	}

	public void setVipId(Long vipId) {
		this.vipId = vipId;
	}

	@Column(name = "guest_name", length = 32)
	public String getGuestName() {
		return this.guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	@Column(name = "ip_address")
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "remark", length = 65535)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RBookroom")
	public Set<RBookroomType> getRBookroomTypes() {
		return this.RBookroomTypes;
	}

	public void setRBookroomTypes(Set<RBookroomType> RBookroomTypes) {
		this.RBookroomTypes = RBookroomTypes;
	}

}
