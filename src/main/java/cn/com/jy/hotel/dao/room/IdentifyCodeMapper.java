package cn.com.jy.hotel.dao.room;

import cn.com.jy.hotel.domain.room.IdentifyCode;

public interface IdentifyCodeMapper {
    int deleteByPrimaryKey(String phone_number);

    int insert(IdentifyCode record);

    int insertSelective(IdentifyCode record);

    IdentifyCode selectByPrimaryKey(String phone_number);

    int updateByPrimaryKeySelective(IdentifyCode record);

    int updateByPrimaryKey(IdentifyCode record);
}