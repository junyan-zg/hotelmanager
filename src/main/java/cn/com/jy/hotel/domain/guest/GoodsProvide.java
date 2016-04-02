package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;
import java.math.BigDecimal;

import cn.com.jy.hotel.utils.BigDecimalUtils;

/**
 * 
 * @ClassName: GoodsProvide
 * @Description: 酒店提供生活用品（不需要另外付费）
 * @author zjy
 * @date 2016年4月2日 上午5:21:57
 *
 */
public class GoodsProvide implements Serializable {
	private static final long serialVersionUID = -922974397951302179L;
	private Integer id;
	/**
	 * 物品名称
	 */
	private String item_name;
	/**
	 * 库存量
	 */
	private Integer stock;
	/**
	 * 购入成本价
	 */
	private BigDecimal cost;
	/**
	 * 物品描述
	 */
	private String item;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name == null ? null : item_name.trim();
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getCost() {
		return BigDecimalUtils.deal(cost);
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item == null ? null : item.trim();
	}
}