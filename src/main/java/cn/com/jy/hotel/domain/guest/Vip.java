package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName: Vip
 * @Description: 会员表
 * @author zjy
 * @date 2016年4月2日 上午5:32:47
 * 
 */
public class Vip implements Serializable {
	private static final long serialVersionUID = 6610843323462671734L;
	private Long id;
	/**
	 * 会员姓名
	 */
	private String vip_name;
	/**
	 * 会员余额
	 */
	private BigDecimal blances = new BigDecimal(0.00);
	/**
	 * 会员身份证号码
	 */
	private String vip_idCard;
	/**
	 * 会员状态(0有效1无效2暂停)
	 */
	private Byte status = 0;
	/**
	 * 电话号码即会员号码
	 */
	private String vip_phone;
	/**
	 * 会员类型id
	 */
	private Short vip_type_id;
	/**
	 * 会员积分
	 */
	private Long points = 0l;
	/**
	 * 备注
	 */
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVip_name() {
		return vip_name;
	}

	public void setVip_name(String vip_name) {
		this.vip_name = vip_name == null ? null : vip_name.trim();
	}

	public BigDecimal getBlances() {
		return blances;
	}

	public void setBlances(BigDecimal blances) {
		this.blances = blances;
	}

	public String getVip_idCard() {
		return vip_idCard;
	}

	public void setVip_idCard(String vip_idCard) {
		this.vip_idCard = vip_idCard == null ? null : vip_idCard.trim();
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getVip_phone() {
		return vip_phone;
	}

	public void setVip_phone(String vip_phone) {
		this.vip_phone = vip_phone == null ? null : vip_phone.trim();
	}

	public Short getVip_type_id() {
		return vip_type_id;
	}

	public void setVip_type_id(Short vip_type_id) {
		this.vip_type_id = vip_type_id;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}