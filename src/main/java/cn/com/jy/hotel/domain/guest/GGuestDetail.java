package cn.com.jy.hotel.domain.guest;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GGuestDetail generated by hbm2java
 */
@Entity
@Table(name = "g_guest_detail", catalog = "hotel")
public class GGuestDetail implements java.io.Serializable {

	private Long id;
	private GCheckIn GCheckIn;
	private String guestName;
	private byte sex;
	private String idCard;
	private String phone;

	public GGuestDetail() {
	}

	public GGuestDetail(GCheckIn GCheckIn, String guestName, byte sex,
			String idCard) {
		this.GCheckIn = GCheckIn;
		this.guestName = guestName;
		this.sex = sex;
		this.idCard = idCard;
	}

	public GGuestDetail(GCheckIn GCheckIn, String guestName, byte sex,
			String idCard, String phone) {
		this.GCheckIn = GCheckIn;
		this.guestName = guestName;
		this.sex = sex;
		this.idCard = idCard;
		this.phone = phone;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "check_in_id", nullable = false)
	public GCheckIn getGCheckIn() {
		return this.GCheckIn;
	}

	public void setGCheckIn(GCheckIn GCheckIn) {
		this.GCheckIn = GCheckIn;
	}

	@Column(name = "guest_name", nullable = false, length = 32)
	public String getGuestName() {
		return this.guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	@Column(name = "sex", nullable = false)
	public byte getSex() {
		return this.sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	@Column(name = "idCard", nullable = false, length = 20)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
