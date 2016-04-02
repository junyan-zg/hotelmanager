package cn.com.jy.hotel.domain.room;

import java.io.Serializable;

/** 
* @ClassName: BlackList 
* @Description: 黑名单 
* @author zjy
* @date 2016年4月3日 上午1:20:15 
*  
*/ 
public class BlackList implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -5100416291649110083L;

	/** 
    * @Fields phonenumber : 电话号码
    */ 
    private String phonenumber;

    /** 
    * @Fields times : 犯规次数
    */ 
    private Short times;

    /** 
    * @Fields status : 0犯规1移除
    */ 
    private Byte status;

    /** 
    * @Fields description : 行为描述
    */ 
    private String description;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Short getTimes() {
        return times;
    }

    public void setTimes(Short times) {
        this.times = times;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}