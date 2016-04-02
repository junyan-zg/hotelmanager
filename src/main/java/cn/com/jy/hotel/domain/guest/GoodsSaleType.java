package cn.com.jy.hotel.domain.guest;

/**
 * @ClassName: GoodsSaleType
 * @Description: 要出售的商品的类型
 * @author zjy
 * @date 2016年4月2日 上午5:25:26
 * 
 */
public class GoodsSaleType {
	private Short id;
	/**
	 * 类型名称（如弃用则在名称后面加上(已删+时间戳)）
	 */
	private String type_name;
	/**
	 * 状态(0正常1暂用2删除)
	 */
	private Byte status;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name == null ? null : type_name.trim();
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}