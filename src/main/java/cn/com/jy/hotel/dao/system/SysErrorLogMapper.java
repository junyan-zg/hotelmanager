package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysErrorLog;

public interface SysErrorLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysErrorLog record);

    int insertSelective(SysErrorLog record);

    SysErrorLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysErrorLog record);

    int updateByPrimaryKeyWithBLOBs(SysErrorLog record);

    int updateByPrimaryKey(SysErrorLog record);
}