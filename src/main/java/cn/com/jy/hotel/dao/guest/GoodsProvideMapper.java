package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.GoodsProvide;

public interface GoodsProvideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsProvide record);

    int insertSelective(GoodsProvide record);

    GoodsProvide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsProvide record);

    int updateByPrimaryKeyWithBLOBs(GoodsProvide record);

    int updateByPrimaryKey(GoodsProvide record);
}