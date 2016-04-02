package cn.com.jy.hotel.domain.room;

import java.io.Serializable;
import java.util.Date;

/** 
* @ClassName: IdentifyCode 
* @Description: 验证码 
* @author zjy
* @date 2016年4月3日 上午1:24:47 
*  
*/ 
public class IdentifyCode implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 8920948278154868046L;

	/** 
    * @Fields phone_number : 电话号码作为主键
    */ 
    private String phone_number;

    /** 
    * @Fields code : 验证码
    */ 
    private String code;

    /** 
    * @Fields sendTime : 发送时间
    */ 
    private Date sendTime;

    /** 
    * @Fields ip_address : ip地址
    */ 
    private String ip_address;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number == null ? null : phone_number.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address == null ? null : ip_address.trim();
    }
}