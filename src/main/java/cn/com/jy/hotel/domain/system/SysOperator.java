package cn.com.jy.hotel.domain.system;

import java.io.Serializable;

/** 
* @ClassName: SysOperator 
* @Description: TODO 
* @author zjy
* @date 2016年4月3日 上午12:29:24 
*  
*/ 
public class SysOperator implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -8677689278773417375L;

	private Integer id;

    /** 
    * @Fields operator_number : 操作员工号
    */ 
    private Short operator_number;

    /** 
    * @Fields operator_name : 操作员名字
    */ 
    private String operator_name;

    /** 
    * @Fields operator_pwd : 操作员密码
    */ 
    private String operator_pwd;

    /** 
    * @Fields pwd_salt : 操作员密码私盐
    */ 
    private String pwd_salt;

    /** 
    * @Fields sys_role_id : 系统角色id
    */ 
    private Short sys_role_id;

    /** 
    * @Fields status : 0正常1停用2删除
    */ 
    private Byte status = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getOperator_number() {
        return operator_number;
    }

    public void setOperator_number(Short operator_number) {
        this.operator_number = operator_number;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name == null ? null : operator_name.trim();
    }

    public String getOperator_pwd() {
        return operator_pwd;
    }

    public void setOperator_pwd(String operator_pwd) {
        this.operator_pwd = operator_pwd == null ? null : operator_pwd.trim();
    }

    public String getPwd_salt() {
        return pwd_salt;
    }

    public void setPwd_salt(String pwd_salt) {
        this.pwd_salt = pwd_salt == null ? null : pwd_salt.trim();
    }

    public Short getSys_role_id() {
        return sys_role_id;
    }

    public void setSys_role_id(Short sys_role_id) {
        this.sys_role_id = sys_role_id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}