package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.RoomPayMethod;

public interface RoomPayMethodMapper {
    int deleteByPrimaryKey(Short id);

    int insert(RoomPayMethod record);

    int insertSelective(RoomPayMethod record);

    RoomPayMethod selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(RoomPayMethod record);

    int updateByPrimaryKey(RoomPayMethod record);
}