package cn.com.jy.hotel.dao.system;

import cn.com.jy.hotel.domain.system.SysOperator;

public interface SysOperatorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOperator record);

    int insertSelective(SysOperator record);

    SysOperator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOperator record);

    int updateByPrimaryKey(SysOperator record);
}