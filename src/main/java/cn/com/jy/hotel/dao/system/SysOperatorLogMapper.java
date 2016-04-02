package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysOperatorLog;

public interface SysOperatorLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysOperatorLog record);

    int insertSelective(SysOperatorLog record);

    SysOperatorLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysOperatorLog record);

    int updateByPrimaryKeyWithBLOBs(SysOperatorLog record);

    int updateByPrimaryKey(SysOperatorLog record);
}