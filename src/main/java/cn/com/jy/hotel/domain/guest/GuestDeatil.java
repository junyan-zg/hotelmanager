package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;

/**
 * @ClassName: GuestDeatil
 * @Description: 住客身份详情表
 * @author zjy
 * @date 2016年4月2日 上午5:26:53
 * 
 */
public class GuestDeatil implements Serializable {
	private static final long serialVersionUID = -4688519820942988952L;
	private Long id;
	/**
	 * 住宿表id
	 */
	private Long check_in_id;
	/**
	 * 客人姓名
	 */
	private String guest_name;
	/**
	 * 性别(0女1男)
	 */
	private Byte sex;
	/**
	 * 身份证号码
	 */
	private String idCard;
	/**
	 * 电话号码
	 */
	private String phone;

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

	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name == null ? null : guest_name.trim();
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}
}