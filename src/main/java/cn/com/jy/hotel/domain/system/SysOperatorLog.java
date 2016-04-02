package cn.com.jy.hotel.domain.system;

import java.io.Serializable;
import java.util.Date;

/** 
* @ClassName: SysOperatorLog 
* @Description: 操作员日志表 
* @author zjy
* @date 2016年4月3日 上午12:27:29 
*  
*/ 
public class SysOperatorLog implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -491374943094551311L;

	private Long id;

    /** 
    * @Fields eventTime : 事件时间
    */ 
    private Date eventTime;

    /** 
    * @Fields ip_address : ip地址
    */ 
    private String ip_address;

    /** 
    * @Fields operator_id : 操作员id
    */ 
    private Integer operator_id;

    /** 
    * @Fields description : 行为描述
    */ 
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address == null ? null : ip_address.trim();
    }

    public Integer getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Integer operator_id) {
        this.operator_id = operator_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}