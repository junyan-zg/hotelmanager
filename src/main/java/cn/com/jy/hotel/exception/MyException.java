/**   
 * @Title: MyException.java 
 * @Package exception 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月17日 上午2:20:33 
 * @version V1.0   
 */
package cn.com.jy.hotel.exception;


/**
 * @ClassName: MyException
 * @Description: TODO
 * @author zjy
 * @date 2016年4月17日 上午2:20:33
 * 
 */
public class MyException extends Exception {
	
	private String exInfo;
	
	private short state = 0;//0源码返回，1跳转页面，2返回封装js
	
	public MyException(String exInfo,short state) {
		super(exInfo);
		this.exInfo = exInfo;
		this.setState(state);
	}
	
	public MyException(String exInfo,Exception e) {
		super(e);
		this.exInfo = exInfo;
	}

	public String getExInfo() {
		return this.exInfo;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}
}
