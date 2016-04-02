package cn.com.jy.hotel.dao.gain;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import cn.com.jy.hotel.dao.BaseTest;
import cn.com.jy.hotel.domain.gain.Income_Day;

/**
* @ClassName: TestDayMapper 
* @Description: TODO 
* @author zjy
* @date 2016年4月3日 上午4:19:45 
*
 */
public class TestDayMapper extends BaseTest {
	
	private Income_DayMapper income_DayMapper;
	
	@Before
	public void beanInit(){
		income_DayMapper = (Income_DayMapper) getBean("income_DayMapper");
	}
	
	@Test
	public void deleteByPrimaryKey(){
		int e = income_DayMapper.deleteByPrimaryKey(new Date());
		System.out.println(e);
	}
	@Test
	public void insert(){
		Income_Day income_Day = new Income_Day();
		income_Day.setDayTime(new Date());
		income_Day.setIncome(new BigDecimal(10000.32));
		income_Day.setCost(new BigDecimal(45666.44));
		long time = System.currentTimeMillis();
		income_DayMapper.insert(income_Day);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time);
	}
	@Test
	public void insertSelective(){
		
	}
	@Test
	public void selectByPrimaryKey(){
		long time = System.currentTimeMillis();
		Income_Day income_Day = income_DayMapper.selectByPrimaryKey(new Date());
		long time2 = System.currentTimeMillis();
		System.out.println(income_Day.getDayTime());
		System.out.println(income_Day.getIncome());
		System.out.println(income_Day.getCost());
		System.out.println(income_Day.getProfit());
		System.out.println(time2-time);
	}
	@Test
	public void updateByPrimaryKeySelective(){
	
	}
	@Test
	public void updateByPrimaryKey(){
		Income_Day income_Day = income_DayMapper.selectByPrimaryKey(new Date());
		income_Day.setCost(new BigDecimal(666.38));
		int e = income_DayMapper.updateByPrimaryKey(income_Day);
		System.out.println(income_Day.getDayTime());
		System.out.println(income_Day.getIncome());
		System.out.println(income_Day.getCost());
		System.out.println(income_Day.getProfit());
		System.out.println("影响行数："+e);
	}
}
