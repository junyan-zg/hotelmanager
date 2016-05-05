package cn.com.jy.hotel.domain.guest.sub;


public class GVipTypeSub implements java.io.Serializable {

	private Short id;
	private String vipTypeName;
	private byte vipDiscount;
	private String description;
	
	public GVipTypeSub() {
	}
	
	public GVipTypeSub(Short id,String vipTypeName, byte vipDiscount, String description) {
		this.id = id; 
		this.vipTypeName = vipTypeName;
		this.vipDiscount = vipDiscount;
		this.description = description;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getVipTypeName() {
		return vipTypeName;
	}

	public void setVipTypeName(String vipTypeName) {
		this.vipTypeName = vipTypeName;
	}

	public byte getVipDiscount() {
		return vipDiscount;
	}

	public void setVipDiscount(byte vipDiscount) {
		this.vipDiscount = vipDiscount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
