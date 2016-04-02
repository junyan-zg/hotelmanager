package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.GoodsSaleType;

public interface GoodsSaleTypeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(GoodsSaleType record);

    int insertSelective(GoodsSaleType record);

    GoodsSaleType selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(GoodsSaleType record);

    int updateByPrimaryKey(GoodsSaleType record);
}