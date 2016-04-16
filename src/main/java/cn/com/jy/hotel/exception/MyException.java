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
	
	private boolean returnJson = true;

	public MyException(String exInfo,boolean returnJson) {
		super(exInfo);
		this.exInfo = exInfo;
		this.returnJson = returnJson;
	}
	
	public MyException(String exInfo,Exception e) {
		super(e);
		this.exInfo = exInfo;
	}

	public String getExInfo() {
		return this.exInfo;
	}
	
	public boolean isReturnJson() {
		return this.returnJson;
	}
}
