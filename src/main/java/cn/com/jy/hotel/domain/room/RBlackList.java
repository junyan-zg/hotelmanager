package cn.com.jy.hotel.domain.room;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RBlackList generated by hbm2java
 */
@Entity
@Table(name = "r_black_list", catalog = "hotel")
public class RBlackList implements java.io.Serializable {

	private String phonenumber;
	private String description;
	private short times;
	private Byte status;

	public RBlackList() {
	}

	public RBlackList(String phonenumber, short times) {
		this.phonenumber = phonenumber;
		this.times = times;
	}

	public RBlackList(String phonenumber, String description, short times,
			Byte status) {
		this.phonenumber = phonenumber;
		this.description = description;
		this.times = times;
		this.status = status;
	}

	@Id
	@Column(name = "phonenumber", unique = true, nullable = false, length = 11)
	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "times", nullable = false)
	public short getTimes() {
		return this.times;
	}

	public void setTimes(short times) {
		this.times = times;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
