/**   
* @Title: Helper2.java 
* @Package cn.com.jy.hotel.data 
* @Description: TODO 
* @author zjy   
* @date 2016年5月1日 上午3:10:26 
* @version V1.0   
*/ 
package cn.com.jy.hotel.data;

import java.io.Serializable;

/** 
 * @ClassName: Helper2 
 * @Description: TODO 
 * @author zjy
 * @date 2016年5月1日 上午3:10:26 
 *  
 */
public class Helper2 implements Serializable{
	private Serializable id;
	private String text;
	public Serializable getId() {
		return id;
	}
	public void setId(Serializable id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Helper2(Serializable id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public Helper2() {
	}
	
}
