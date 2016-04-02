package cn.com.jy.hotel.domain.system;

import java.io.Serializable;

/** 
* @ClassName: SysRole 
* @Description: 系统操作员角色 
* @author zjy
* @date 2016年4月3日 上午12:26:33 
*  
*/ 
public class SysRole implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 8881056318398047057L;

	private Short id;

    /** 
    * @Fields name : 角色名称
    */ 
    private String name;

    /** 
    * @Fields description : 角色描述
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