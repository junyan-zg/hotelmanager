package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.CheckIn;

public interface CheckInMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckIn record);

    int insertSelective(CheckIn record);

    CheckIn selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckIn record);

    int updateByPrimaryKeyWithBLOBs(CheckIn record);

    int updateByPrimaryKey(CheckIn record);
}