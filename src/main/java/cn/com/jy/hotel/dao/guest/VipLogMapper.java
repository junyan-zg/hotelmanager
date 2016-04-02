package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.VipLog;

public interface VipLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VipLog record);

    int insertSelective(VipLog record);

    VipLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VipLog record);

    int updateByPrimaryKeyWithBLOBs(VipLog record);

    int updateByPrimaryKey(VipLog record);
}