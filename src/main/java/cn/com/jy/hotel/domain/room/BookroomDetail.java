package cn.com.jy.hotel.domain.room;

import java.io.Serializable;

/** 
* @ClassName: BookroomDetail 
* @Description: 预订详细表,此表数据由前台审批通过预订安排房间号后插入 
* @author zjy
* @date 2016年4月3日 上午1:23:13 
*  
*/ 
public class BookroomDetail implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 8632754536270974023L;

	private Long id;

    /** 
    * @Fields bookroom_type_id : 订房类型id
    */ 
    private Long bookroom_type_id;

    /** 
    * @Fields room_id : 房间号id
    */ 
    private Long room_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookroom_type_id() {
        return bookroom_type_id;
    }

    public void setBookroom_type_id(Long bookroom_type_id) {
        this.bookroom_type_id = bookroom_type_id;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }
}