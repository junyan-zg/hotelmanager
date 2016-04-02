package cn.com.jy.hotel.domain.system;

import java.io.Serializable;

/** 
* @ClassName: SysRolePrivilege 
* @Description: 系统角色权限 
* @author zjy
* @date 2016年4月3日 上午1:04:30 
*  
*/ 
public class SysRolePrivilege implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 8227581557563439582L;

	private Integer id;

    /** 
    * @Fields role_id : 角色id
    */ 
    private Short role_id;

    /** 
    * @Fields privilege_id : 权限id
    */ 
    private Short privilege_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getRole_id() {
        return role_id;
    }

    public void setRole_id(Short role_id) {
        this.role_id = role_id;
    }

    public Short getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(Short privilege_id) {
        this.privilege_id = privilege_id;
    }
}