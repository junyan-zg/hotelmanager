package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.CheckInGoodsCost;

public interface CheckInGoodsCostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckInGoodsCost record);

    int insertSelective(CheckInGoodsCost record);

    CheckInGoodsCost selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckInGoodsCost record);

    int updateByPrimaryKey(CheckInGoodsCost record);
}