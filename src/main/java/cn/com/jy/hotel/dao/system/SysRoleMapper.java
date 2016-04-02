package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKeyWithBLOBs(SysRole record);

    int updateByPrimaryKey(SysRole record);
}