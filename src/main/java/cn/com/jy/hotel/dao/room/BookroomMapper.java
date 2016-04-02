package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.Bookroom;

public interface BookroomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bookroom record);

    int insertSelective(Bookroom record);

    Bookroom selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bookroom record);

    int updateByPrimaryKeyWithBLOBs(Bookroom record);

    int updateByPrimaryKey(Bookroom record);
}