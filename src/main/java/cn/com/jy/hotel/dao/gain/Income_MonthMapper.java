package cn.com.jy.hotel.dao.gain;

import cn.com.jy.hotel.domain.gain.Income_Month;
import java.util.Date;

public interface Income_MonthMapper {
    int deleteByPrimaryKey(Date dayTime);

    int insert(Income_Month record);

    @Deprecated
    int insertSelective(Income_Month record);

    Income_Month selectByPrimaryKey(Date dayTime);

    @Deprecated
    int updateByPrimaryKeySelective(Income_Month record);

    int updateByPrimaryKey(Income_Month record);
}