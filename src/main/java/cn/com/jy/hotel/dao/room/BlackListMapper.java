package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.BlackList;

public interface BlackListMapper {
    int deleteByPrimaryKey(String phonenumber);

    int insert(BlackList record);

    int insertSelective(BlackList record);

    BlackList selectByPrimaryKey(String phonenumber);

    int updateByPrimaryKeySelective(BlackList record);

    int updateByPrimaryKeyWithBLOBs(BlackList record);

    int updateByPrimaryKey(BlackList record);
}