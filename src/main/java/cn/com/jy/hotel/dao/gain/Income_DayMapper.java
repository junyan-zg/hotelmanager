package cn.com.jy.hotel.dao.gain;

import cn.com.jy.hotel.domain.gain.Income_Day;
import java.util.Date;

public interface Income_DayMapper {
    int deleteByPrimaryKey(Date dayTime);

    int insert(Income_Day record);

    int insertSelective(Income_Day record);

    Income_Day selectByPrimaryKey(Date dayTime);

    int updateByPrimaryKeySelective(Income_Day record);

    int updateByPrimaryKey(Income_Day record);
}