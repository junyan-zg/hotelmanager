/**   
* @Title: H.java 
* @Package cn.com.jy.hotel.data 
* @Description: TODO 
* @author zjy   
* @date 2016年4月29日 下午1:50:54 
* @version V1.0   
*/ 
package cn.com.jy.hotel.data;

import java.io.Serializable;

/** 
 * @ClassName: Helper 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月29日 下午1:50:54 
 *  
 */
public class Helper implements Serializable{
	private String value;

	public Helper(String value){this.value = value;};

	public Helper(){}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}