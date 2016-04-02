package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.GoodsSale;

public interface GoodsSaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSale record);

    int insertSelective(GoodsSale record);

    GoodsSale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsSale record);

    int updateByPrimaryKeyWithBLOBs(GoodsSale record);

    int updateByPrimaryKey(GoodsSale record);
}