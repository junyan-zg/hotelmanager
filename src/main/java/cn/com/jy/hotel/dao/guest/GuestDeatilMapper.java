package cn.com.jy.hotel.dao.guest;

import cn.com.jy.hotel.domain.guest.GuestDeatil;

public interface GuestDeatilMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GuestDeatil record);

    int insertSelective(GuestDeatil record);

    GuestDeatil selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GuestDeatil record);

    int updateByPrimaryKey(GuestDeatil record);
}