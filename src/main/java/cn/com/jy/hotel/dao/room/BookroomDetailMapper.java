package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.BookroomDetail;

public interface BookroomDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BookroomDetail record);

    int insertSelective(BookroomDetail record);

    BookroomDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BookroomDetail record);

    int updateByPrimaryKey(BookroomDetail record);
}