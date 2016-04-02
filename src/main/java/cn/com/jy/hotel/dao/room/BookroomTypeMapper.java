package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.BookroomType;

public interface BookroomTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BookroomType record);

    int insertSelective(BookroomType record);

    BookroomType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BookroomType record);

    int updateByPrimaryKey(BookroomType record);
}