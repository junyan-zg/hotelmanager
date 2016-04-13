package cn.com.jy.hotel.domain.room;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RIdentifyCode generated by hbm2java
 */
@Entity
@Table(name = "r_identify_code", catalog = "hotel")
public class RIdentifyCode implements java.io.Serializable {

	private String phoneNumber;
	private String code;
	private Date sendTime;
	private String ipAddress;

	public RIdentifyCode() {
	}

	public RIdentifyCode(String phoneNumber, String code, Date sendTime) {
		this.phoneNumber = phoneNumber;
		this.code = code;
		this.sendTime = sendTime;
	}

	public RIdentifyCode(String phoneNumber, String code, Date sendTime,
			String ipAddress) {
		this.phoneNumber = phoneNumber;
		this.code = code;
		this.sendTime = sendTime;
		this.ipAddress = ipAddress;
	}

	@Id
	@Column(name = "phone_number", unique = true, nullable = false, length = 11)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "code", nullable = false, length = 6)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sendTime", nullable = false, length = 19)
	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	@Column(name = "ip_address")
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
