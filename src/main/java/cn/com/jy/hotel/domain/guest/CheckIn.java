package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import cn.com.jy.hotel.utils.BigDecimalUtils;

/**
 * @ClassName: CheckIn
 * @Description: 住宿
 * @author zjy
 * @date 2016年4月2日 上午4:54:34
 * 
 */
public class CheckIn implements Serializable {
	private static final long serialVersionUID = 4082815540664818695L;
	private Long id;
	/**
	 * 状态(0：正常入住，1：已结账；2：挂账)
	 */
	private Byte status;
	/**
	 * 享受折扣（由会员类型算出）,默认10，不打折
	 */
	private Byte discount = 10;
	/**
	 * 消费总金额（未打折）(由系统生成)
	 */
	private BigDecimal allCost;
	/**
	 * 会员余额支付
	 */
	private BigDecimal vipPay = new BigDecimal(0.00);
	/**
	 * 现金支付
	 */
	private BigDecimal cashPay = new BigDecimal(0.00);
	/**
	 * 网银支付
	 */
	private BigDecimal webPay = new BigDecimal(0.00);
	/**
	 * 打折后应付（此项应为三项支付之和）(由系统生成)
	 */
	private BigDecimal shouldPay;
	/**
	 * 现已支付
	 */
	private BigDecimal hadPay;
	/**
	 * 开始入住时间
	 */
	private Date startTime;
	/**
	 * 实际退房时间（该值由最后退房（而不是换房）填写）
	 */
	private Date actuallyEndTime;
	/**
	 * 押金
	 */
	private BigDecimal deposit;
	/**
	 * 押金返还
	 */
	private BigDecimal deposit_return = new BigDecimal(0.00);
	/**
	 * 会员id（如果是会员则填写）
	 */
	private Long vip_id;
	/**
	 * 当押金返还小于押金时请附加描述
	 */
	private String deposit_cost_desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getDiscount() {
		return discount;
	}

	public void setDiscount(Byte discount) {
		this.discount = discount;
	}

	public BigDecimal getAllCost() {
		return BigDecimalUtils.deal(allCost);
	}

	public void setAllCost(BigDecimal allCost) {
		this.allCost = allCost;
	}

	public BigDecimal getVipPay() {
		return BigDecimalUtils.deal(vipPay);
	}

	public void setVipPay(BigDecimal vipPay) {
		this.vipPay = vipPay;
	}

	public BigDecimal getCashPay() {
		return BigDecimalUtils.deal(cashPay);
	}

	public void setCashPay(BigDecimal cashPay) {
		this.cashPay = cashPay;
	}

	public BigDecimal getWebPay() {
		return BigDecimalUtils.deal(webPay);
	}

	public void setWebPay(BigDecimal webPay) {
		this.webPay = webPay;
	}

	public BigDecimal getShouldPay() {
		return BigDecimalUtils.deal(shouldPay);
	}

	public void setShouldPay(BigDecimal shouldPay) {
		this.shouldPay = shouldPay;
	}

	public BigDecimal getHadPay() {
		return BigDecimalUtils.deal(hadPay);
	}

	public void setHadPay(BigDecimal hadPay) {
		this.hadPay = hadPay;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getActuallyEndTime() {
		return actuallyEndTime;
	}

	public void setActuallyEndTime(Date actuallyEndTime) {
		this.actuallyEndTime = actuallyEndTime;
	}

	public BigDecimal getDeposit() {
		return BigDecimalUtils.deal(deposit);
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getDeposit_return() {
		return BigDecimalUtils.deal(deposit_return);
	}

	public void setDeposit_return(BigDecimal deposit_return) {
		this.deposit_return = deposit_return;
	}

	public Long getVip_id() {
		return vip_id;
	}

	public void setVip_id(Long vip_id) {
		this.vip_id = vip_id;
	}

	public String getDeposit_cost_desc() {
		return deposit_cost_desc;
	}

	public void setDeposit_cost_desc(String deposit_cost_desc) {
		this.deposit_cost_desc = deposit_cost_desc == null ? null
				: deposit_cost_desc.trim();
	}
}