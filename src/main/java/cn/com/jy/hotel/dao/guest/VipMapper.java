package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKeyWithBLOBs(Vip record);

    int updateByPrimaryKey(Vip record);
}