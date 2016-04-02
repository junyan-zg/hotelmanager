package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.GuestRoomDeatil;

public interface GuestRoomDeatilMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GuestRoomDeatil record);

    int insertSelective(GuestRoomDeatil record);

    GuestRoomDeatil selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GuestRoomDeatil record);

    int updateByPrimaryKey(GuestRoomDeatil record);
}