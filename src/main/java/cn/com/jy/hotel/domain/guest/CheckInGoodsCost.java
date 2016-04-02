package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName: CheckInGoodsCost
 * @Description: 住客商品消费
 * @author zjy
 * @date 2016年4月2日 上午4:58:26
 * 
 */
public class CheckInGoodsCost implements Serializable {
	private static final long serialVersionUID = 150905603665994878L;
	private Long id;
	/**
	 * 住宿表id
	 */
	private Long check_in_id;
	/**
	 * 商品表id
	 */
	private Integer goods_sale_id;
	/**
	 * 购买数量
	 */
	private Integer buyCount;
	/**
	 * 账单共花费
	 */
	private BigDecimal cost;

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

	public Integer getGoods_sale_id() {
		return goods_sale_id;
	}

	public void setGoods_sale_id(Integer goods_sale_id) {
		this.goods_sale_id = goods_sale_id;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}