package cn.com.jy.hotel.dao.gain;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import cn.com.jy.hotel.dao.BaseTest;
import cn.com.jy.hotel.domain.gain.Income_Month;

/**
* @ClassName: TestMonthMapper 
* @Description: TODO 
* @author zjy
* @date 2016年4月3日 上午4:19:45 
*
 */
public class TestMonthMapper extends BaseTest {
	
	private Income_MonthMapper income_MonthMapper;

	@Before
	public void beanInit(){
		income_MonthMapper = (Income_MonthMapper) getBean("income_MonthMapper");
	}
	
	@Test
	public void deleteByPrimaryKey(){
		int e = income_MonthMapper.deleteByPrimaryKey(new Date());
		System.out.println(e);
	}
	@Test
	public void insert(){
		Income_Month income_Month = new Income_Month();
		income_Month.setDayTime(new Date());
		income_Month.setIncome(new BigDecimal(10000.32));
		income_Month.setCost(new BigDecimal(45666.44));
		long time = System.currentTimeMillis();
		income_MonthMapper.insert(income_Month);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time);
	}
	@Test
	public void insertSelective(){
		
	}
	@Test
	public void selectByPrimaryKey(){
		long time = System.currentTimeMillis();
		Income_Month income_Month = income_MonthMapper.selectByPrimaryKey(new Date());
		long time2 = System.currentTimeMillis();
		System.out.println(income_Month.getDayTime());
		System.out.println(income_Month.getIncome());
		System.out.println(income_Month.getCost());
		System.out.println(income_Month.getProfit());
		System.out.println(time2-time);
	}
	@Test
	public void updateByPrimaryKeySelective(){
	
	}
	@Test
	public void updateByPrimaryKey(){
		Income_Month income_Month = income_MonthMapper.selectByPrimaryKey(new Date());
		income_Month.setCost(new BigDecimal(666.38));
		int e = income_MonthMapper.updateByPrimaryKey(income_Month);
		System.out.println(income_Month.getDayTime());
		System.out.println(income_Month.getIncome());
		System.out.println(income_Month.getCost());
		System.out.println(income_Month.getProfit());
		System.out.println("影响行数："+e);
	}
	
}
