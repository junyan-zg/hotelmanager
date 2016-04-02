package cn.com.jy.hotel.domain.guest;

import java.util.Date;

/**
 * @ClassName: VipLog
 * @Description: 会员行为日志
 * @author zjy
 * @date 2016年4月2日 上午5:34:30
 * 
 */
public class VipLog {
	private Long id;
	/**
	 * 日志时间
	 */
	private Date log_time;
	/**
	 * 隶属会员id
	 */
	private Long vip_id;
	/**
	 * 日志详情
	 */
	private String log_detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLog_time() {
		return log_time;
	}

	public void setLog_time(Date log_time) {
		this.log_time = log_time;
	}

	public Long getVip_id() {
		return vip_id;
	}

	public void setVip_id(Long vip_id) {
		this.vip_id = vip_id;
	}

	public String getLog_detail() {
		return log_detail;
	}

	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail == null ? null : log_detail.trim();
	}
}