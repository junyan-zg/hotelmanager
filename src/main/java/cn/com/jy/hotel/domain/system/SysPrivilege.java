package cn.com.jy.hotel.domain.system;

import java.io.Serializable;

/** 
* @ClassName: SysPrivilege 
* @Description: 系统权限表 
* @author zjy
* @date 2016年4月3日 上午12:28:28 
*  
*/ 
public class SysPrivilege implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 3025062974429634410L;

	private Short id;

    /** 
    * @Fields name : 权限名称
    */ 
    private String name;

    /** 
    * @Fields description : 权限描述
    */ 
    private String description;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}