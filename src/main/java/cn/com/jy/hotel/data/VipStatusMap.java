/**   
 * @Title: RoomStatusMap.java 
 * @Package cn.com.jy.hotel.data 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月29日 下午12:02:44 
 * @version V1.0   
 */
package cn.com.jy.hotel.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: VipStatusMap
 * @Description: TODO
 * @author zjy
 * @date 2016年4月29日 下午12:02:44
 * 
 */
public class VipStatusMap {
	private static Map<Byte, String> map = null;
	private static List<Helper> list = null;
	private static List<Helper2> list2 = null;
	static {
		map = new HashMap<>();
		map.put((byte) 0, "有效");
		map.put((byte) 1, "无效");
	
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		
		for (Map.Entry<Byte, String> entry : map.entrySet()) {
			list.add(new Helper(entry.getValue()));
			list2.add(new Helper2(entry.getKey(),entry.getValue()));
		}
	}

	public static byte getByte(String str) {
		return (byte) BaseMap.getVal(map, str);
	}

	public static String getString(Serializable b) {
		if (b instanceof Integer) {
			b = ((Integer) b).byteValue();
		}
		return map.get(b);
	}

	public static List<Helper> getHelperList() {
		return list;
	}
	
	public static List<Helper2> getHelper2List() {
		return list2;
	}

}