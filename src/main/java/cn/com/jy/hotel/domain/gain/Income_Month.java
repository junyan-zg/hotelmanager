package cn.com.jy.hotel.domain.gain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import cn.com.jy.hotel.utils.BigDecimalUtils;

/**
 * @ClassName: Income_Month
 * @Description: 每月收益
 * @author zjy
 * @date 2016年4月2日 上午4:52:51
 * 
 */
public class Income_Month implements Serializable{
	private static final long serialVersionUID = 7202835001227452923L;

	/**
	 * 主键：月
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
	@SuppressWarnings("unused")
	private BigDecimal profit = new BigDecimal(0.00);

	public Date getDayTime() {
		return dayTime;
	}

	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}

	public BigDecimal getIncome() {
		return BigDecimalUtils.deal(income);
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getCost() {
		return BigDecimalUtils.deal(cost);
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getProfit() {
		return BigDecimalUtils.deal(income.subtract(cost));
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
}