package cn.com.jy.hotel.domain.room;

import java.io.Serializable;

/** 
* @ClassName: BookroomType 
* @Description: 订房选择房间类型 
* @author zjy
* @date 2016年4月3日 上午1:42:52 
*  
*/ 
public class BookroomType implements Serializable{
	private static final long serialVersionUID = -797662654289353556L;

	private Long id;

    /** 
    * @Fields room_type_id : 房间类型id
    */ 
    private Short room_type_id;

    /** 
    * @Fields room_type_count : 选择该房间类型数量
    */ 
    private Short room_type_count = 1;

    /** 
    * @Fields bookroom_id : 订房表id
    */ 
    private Long bookroom_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Short room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Short getRoom_type_count() {
        return room_type_count;
    }

    public void setRoom_type_count(Short room_type_count) {
        this.room_type_count = room_type_count;
    }

    public Long getBookroom_id() {
        return bookroom_id;
    }

    public void setBookroom_id(Long bookroom_id) {
        this.bookroom_id = bookroom_id;
    }
}