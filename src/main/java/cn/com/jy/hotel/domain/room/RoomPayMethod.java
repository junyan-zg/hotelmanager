package cn.com.jy.hotel.domain.room;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
* @ClassName: RoomPayMethod 
* @Description: 房间计费方案 
* @author zjy
* @date 2016年4月3日 上午1:37:02 
*  
*/ 
public class RoomPayMethod implements Serializable{
	private static final long serialVersionUID = 3237513915190162517L;

	private Short id;

    /** 
    * @Fields room_type_id : 房间类型id
    */ 
    private Short room_type_id;

    /** 
    * @Fields pay_method_name : 方案名称（如状态为已删则要在方案名称加上(已删)）
    */ 
    private String pay_method_name;

    /** 
    * @Fields startupTime : 起步时间单位分钟
    */ 
    private Integer startupTime;

    /** 
    * @Fields startupPrice : 起步价钱单位元
    */ 
    private BigDecimal startupPrice;

    /** 
    * @Fields standardTime : 标准计费时间:过起步时间后按此时间计算,单位分钟
    */ 
    private Integer standardTime;

    /** 
    * @Fields standardPrice : 标准计费金额
    */ 
    private BigDecimal standardPrice;

    /** 
    * @Fields minTime : 最小计费时间
    */ 
    private Integer minTime;

    /** 
    * @Fields minPrice : 最小计费金额
    */ 
    private BigDecimal minPrice;

    /** 
    * @Fields status : 方案状态（0正常使用1停用2删除）
    */ 
    private Byte status;

    /** 
    * @Fields payType : 0为钟点房1为过夜房
    */ 
    private Byte payType;

    /** 
    * @Fields checkInTime : 入住时间（当天某个时间点）
    */ 
    private Date checkInTime;

    /** 
    * @Fields checkOutTime : 退房时间（明天某个时间点）
    */ 
    private Date checkOutTime;

    /** 
    * @Fields dayPrice : 日总价
    */ 
    private BigDecimal dayPrice;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Short room_type_id) {
        this.room_type_id = room_type_id;
    }

    public String getPay_method_name() {
        return pay_method_name;
    }

    public void setPay_method_name(String pay_method_name) {
        this.pay_method_name = pay_method_name == null ? null : pay_method_name.trim();
    }

    public Integer getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(Integer startupTime) {
        this.startupTime = startupTime;
    }

    public BigDecimal getStartupPrice() {
        return startupPrice;
    }

    public void setStartupPrice(BigDecimal startupPrice) {
        this.startupPrice = startupPrice;
    }

    public Integer getStandardTime() {
        return standardTime;
    }

    public void setStandardTime(Integer standardTime) {
        this.standardTime = standardTime;
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Integer getMinTime() {
        return minTime;
    }

    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public BigDecimal getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(BigDecimal dayPrice) {
        this.dayPrice = dayPrice;
    }
}