package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysVariable;

public interface SysVariableMapper {
    int deleteByPrimaryKey(String var_name);

    int insert(SysVariable record);

    int insertSelective(SysVariable record);

    SysVariable selectByPrimaryKey(String var_name);

    int updateByPrimaryKeySelective(SysVariable record);

    int updateByPrimaryKey(SysVariable record);
}