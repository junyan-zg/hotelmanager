package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.RoomGroup;

public interface RoomGroupMapper {
    int deleteByPrimaryKey(Short id);

    int insert(RoomGroup record);

    int insertSelective(RoomGroup record);

    RoomGroup selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(RoomGroup record);

    int updateByPrimaryKeyWithBLOBs(RoomGroup record);

    int updateByPrimaryKey(RoomGroup record);
}