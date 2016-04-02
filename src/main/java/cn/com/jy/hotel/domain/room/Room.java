package cn.com.jy.hotel.domain.room;

import java.io.Serializable;

/** 
* @ClassName: Room 
* @Description: 房间 
* @author zjy
* @date 2016年4月3日 上午1:25:40 
*  
*/ 
public class Room implements Serializable{
	private static final long serialVersionUID = -2881984239000729137L;

	private Integer id;

    /** 
    * @Fields room_number : 房间号
    */ 
    private String room_number;

    /** 
    * @Fields room_type_id : 房间类型id
    */ 
    private Short room_type_id;

    /** 
    * @Fields room_status : 房态
    */ 
    private Byte room_status;

    /** 
    * @Fields group_id : 房间分组id
    */ 
    private Short group_id;

    /** 
    * @Fields guest_room_detail_id : 正在住宿的住宿详情表id
    */ 
    private Long guest_room_detail_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number == null ? null : room_number.trim();
    }

    public Short getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Short room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Byte getRoom_status() {
        return room_status;
    }

    public void setRoom_status(Byte room_status) {
        this.room_status = room_status;
    }

    public Short getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Short group_id) {
        this.group_id = group_id;
    }

    public Long getGuest_room_detail_id() {
        return guest_room_detail_id;
    }

    public void setGuest_room_detail_id(Long guest_room_detail_id) {
        this.guest_room_detail_id = guest_room_detail_id;
    }
}