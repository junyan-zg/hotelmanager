package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysPrivilege;

public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysPrivilege record);

    int insertSelective(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SysPrivilege record);

    int updateByPrimaryKeyWithBLOBs(SysPrivilege record);

    int updateByPrimaryKey(SysPrivilege record);
}