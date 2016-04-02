package cn.com.jy.hotel.domain.room;

import java.math.BigDecimal;

import cn.com.jy.hotel.utils.BigDecimalUtils;

/** 
* @ClassName: RoomType 
* @Description: 房间类型表，如单人房双人房 
* @author zjy
* @date 2016年4月3日 上午1:39:14 
*  
*/ 
public class RoomType {
    private Short id;

    /** 
    * @Fields room_type_name : 房间类型名称
    */ 
    private String room_type_name;

    /** 
    * @Fields max_people : 可最大入住人数
    */ 
    private Short max_people;

    /** 
    * @Fields deposit : 押金
    */ 
    private BigDecimal deposit;

    /** 
    * @Fields description : 房间类型描述
    */ 
    private String description;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRoom_type_name() {
        return room_type_name;
    }

    public void setRoom_type_name(String room_type_name) {
        this.room_type_name = room_type_name == null ? null : room_type_name.trim();
    }

    public Short getMax_people() {
        return max_people;
    }

    public void setMax_people(Short max_people) {
        this.max_people = max_people;
    }

    public BigDecimal getDeposit() {
        return BigDecimalUtils.deal(deposit);
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}