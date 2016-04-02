package cn.com.jy.hotel.domain.room;

import java.io.Serializable;
import java.util.Date;

/** 
* @ClassName: Bookroom 
* @Description: TODO 
* @author zjy
* @date 2016年4月3日 上午1:21:27 
*  
*/ 
public class Bookroom implements Serializable{
	private static final long serialVersionUID = 6719262137228613868L;

	private Long id;

    /** 
    * @Fields phone_call : 电话号码（如为网订则该号码为登录号码，如为电话订房则该号码为来电号码）
    */ 
    private String phone_call;

    /** 
    * @Fields phone_remain : 电话号码2（客户预留电话）
    */ 
    private String phone_remain;

    /** 
    * @Fields bill_status : 状态（0刚下订1通过2未通过3通过后由于客人未到作废4成功转到住宿表）
    */ 
    private Byte bill_status;

    /** 
    * @Fields guest_status : 客户状态（0现未到1超时没到2超时未到但经服务员确认允许继续预订）
    */ 
    private Byte guest_status;

    /** 
    * @Fields book_startTime : 预订开始日期
    */ 
    private Date book_startTime;

    /** 
    * @Fields book_endTime : 预订结束日期
    */ 
    private Date book_endTime;

    /** 
    * @Fields vip_id : 会员id如有则填写
    */ 
    private Long vip_id;

    /** 
    * @Fields guest_name : 订房人姓名
    */ 
    private String guest_name;

    /** 
    * @Fields ip_address : ip地址
    */ 
    private String ip_address;

    /** 
    * @Fields remark : 备注
    */ 
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone_call() {
        return phone_call;
    }

    public void setPhone_call(String phone_call) {
        this.phone_call = phone_call == null ? null : phone_call.trim();
    }

    public String getPhone_remain() {
        return phone_remain;
    }

    public void setPhone_remain(String phone_remain) {
        this.phone_remain = phone_remain == null ? null : phone_remain.trim();
    }

    public Byte getBill_status() {
        return bill_status;
    }

    public void setBill_status(Byte bill_status) {
        this.bill_status = bill_status;
    }

    public Byte getGuest_status() {
        return guest_status;
    }

    public void setGuest_status(Byte guest_status) {
        this.guest_status = guest_status;
    }

    public Date getBook_startTime() {
        return book_startTime;
    }

    public void setBook_startTime(Date book_startTime) {
        this.book_startTime = book_startTime;
    }

    public Date getBook_endTime() {
        return book_endTime;
    }

    public void setBook_endTime(Date book_endTime) {
        this.book_endTime = book_endTime;
    }

    public Long getVip_id() {
        return vip_id;
    }

    public void setVip_id(Long vip_id) {
        this.vip_id = vip_id;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name == null ? null : guest_name.trim();
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address == null ? null : ip_address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}