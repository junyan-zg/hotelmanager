package cn.com.jy.hotel.domain.guest;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @ClassName: GoodsSale
 * @Description: 商品出售表
 * @author zjy
 * @date 2016年4月2日 上午5:23:13
 *
 */
public class GoodsSale implements Serializable {
	private static final long serialVersionUID = 2064426724165724489L;
	private Integer id;
	/**
	 * 商品名称
	 */
	private String item_name;
	/**
	 * 成本价
	 */
	private BigDecimal cost;
	/**
	 * 库存量
	 */
	private Integer stock;
	/**
	 * 出售价
	 */
	private BigDecimal salePrice;
	/**
	 * 商品类型id
	 */
	private Short item_type_id;
	/**
	 * 商品描述
	 */
	private String item_desc;

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

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Short getItem_type_id() {
		return item_type_id;
	}

	public void setItem_type_id(Short item_type_id) {
		this.item_type_id = item_type_id;
	}

	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc == null ? null : item_desc.trim();
	}
}