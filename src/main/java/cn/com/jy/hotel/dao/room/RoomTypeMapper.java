package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.RoomType;

public interface RoomTypeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    RoomType selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKeyWithBLOBs(RoomType record);

    int updateByPrimaryKey(RoomType record);
}