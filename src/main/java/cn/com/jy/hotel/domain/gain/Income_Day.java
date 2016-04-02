package cn.com.jy.hotel.domain.gain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: Income_Day
 * @Description: 每天收益
 * @author zjy
 * @date 2016年4月2日 上午4:49:25
 * 
 */
public class Income_Day {
	/**
	 * 主键：日
	 */
	private Date dayTime;

	/**
	 * 收入
	 */
	private BigDecimal income;

	/**
	 * 支出
	 */
	private BigDecimal cost;

	/**
	 * 利润
	 */
	private BigDecimal profit;
	
	public Date getDayTime() {
		return dayTime;
	}

	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
}