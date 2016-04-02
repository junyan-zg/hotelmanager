package cn.com.jy.hotel.domain.guest;

/**
 * @ClassName: VipType
 * @Description: 会员类型
 * @author zjy
 * @date 2016年4月2日 上午5:35:35
 * 
 */
public class VipType {
	private Short id;
	/**
	 * 会员类型名称
	 */
	private String vip_type_name;
	/**
	 * 会员享受折扣
	 */
	private Byte vip_discount;
	/**
	 * 会员类型描述
	 */
	private String description;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getVip_type_name() {
		return vip_type_name;
	}

	public void setVip_type_name(String vip_type_name) {
		this.vip_type_name = vip_type_name == null ? null : vip_type_name
				.trim();
	}

	public Byte getVip_discount() {
		return vip_discount;
	}

	public void setVip_discount(Byte vip_discount) {
		this.vip_discount = vip_discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}