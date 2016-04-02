package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.VipType;

public interface VipTypeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(VipType record);

    int insertSelective(VipType record);

    VipType selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(VipType record);

    int updateByPrimaryKeyWithBLOBs(VipType record);

    int updateByPrimaryKey(VipType record);
}