package cn.com.jy.hotel.domain.gain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: Income_Day
 * @Description: 每天收益
 * @author zjy
 * @date 2016年4月2日 上午4:49:25
 * 
 */
public class Income_Day implements Serializable{
	private static final long serialVersionUID = -8358424499590978602L;

	/**
	 * 主键：日
	 */
	private Date dayTime;

	/**
	 * 收入
	 */
	private BigDecimal income = new BigDecimal(0.00);

	/**
	 * 支出
	 */
	private BigDecimal cost = new BigDecimal(0.00);

	/**
	 * 利润
	 */
	private BigDecimal profit = new BigDecimal(0.00);
	
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