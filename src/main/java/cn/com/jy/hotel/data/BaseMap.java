/**   
* @Title: BaseMAp.java 
* @Package cn.com.jy.hotel.data 
* @Description: TODO 
* @author zjy   
* @date 2016年4月29日 下午1:11:13 
* @version V1.0   
*/ 
package cn.com.jy.hotel.data;

import java.util.Map;

/** 
 * @ClassName: BaseMAp 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月29日 下午1:11:13 
 *  
 */
public class BaseMap{
	/**
	 * 我们决定用1对1双向查询value->key
	 */
	public static Object getVal(Map<?,?> map,Object key){
		Object val = null;
		for (Map.Entry<?,?> entry : map.entrySet()) {
			   if(key.equals(entry.getValue())){
				   val = entry.getKey();
				   break;
			   }
		}
		return val;
	}
}
