package cn.com.jy.hotel.domain.system;

import java.io.Serializable;

/** 
* @ClassName: SysVariable 
* @Description: 系统变量 
* @author zjy
* @date 2016年4月3日 上午1:05:45 
*  
*/ 
public class SysVariable implements Serializable{
    /** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 6615861410664936707L;

	/** 
    * @Fields var_name : 变量名
    */ 
    private String var_name;

    /** 
    * @Fields var_value : 变量值
    */ 
    private String var_value;

    public String getVar_name() {
        return var_name;
    }

    public void setVar_name(String var_name) {
        this.var_name = var_name == null ? null : var_name.trim();
    }

    public String getVar_value() {
        return var_value;
    }

    public void setVar_value(String var_value) {
        this.var_value = var_value == null ? null : var_value.trim();
    }
}