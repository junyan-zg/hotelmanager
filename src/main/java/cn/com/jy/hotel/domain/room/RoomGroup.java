package cn.com.jy.hotel.domain.room;

import java.io.Serializable;

/** 
* @ClassName: RoomGroup 
* @Description: 房间分组 
* @author zjy
* @date 2016年4月3日 上午1:35:53 
*  
*/ 
public class RoomGroup implements Serializable{
	private static final long serialVersionUID = 1562875836851796397L;

	/** 
    * @Fields id : 主键
    */ 
    private Short id;

    /** 
    * @Fields group_name : 组名(不允许有相同的组名和pid)
    */ 
    private String group_name;

    /** 
    * @Fields parent_id : 上级组的id(若为0则表示其为顶级节点)
    */ 
    private Integer parent_id;

    /** 
    * @Fields remark : 备注
    */ 
    private String remark;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name == null ? null : group_name.trim();
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}