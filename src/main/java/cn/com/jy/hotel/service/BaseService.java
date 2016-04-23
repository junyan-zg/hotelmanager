/**   
* @Title: BaseService.java 
* @Package cn.com.jy.hotel.service.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午10:30:54 
* @version V1.0   
*/ 
package cn.com.jy.hotel.service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/** 
 * @ClassName: BaseService 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午10:30:54 
 *  
 */
public interface BaseService<T> {
	public void add(T t) throws Exception;

	public void update(T t) throws Exception;

	public void delete(Serializable id) throws Exception;

	public T getById(Serializable id) throws Exception;

	public List<T> getByIds(Serializable[] ids) throws Exception;

	public List<T> getAll() throws Exception;

	public int delByConditions(String where,Set<?> whereArgs) throws Exception;
	
	public List<T> queryByConditions(String where, String[] whereArgs,
			String groupBy, String orderBy, Integer limitOffset,
			Integer limitCount) throws Exception;

	public List<T> queryByPrimaryKeys(Serializable[] ids, boolean orderByAsc,
			Integer limitOffset, Integer limitCount) throws Exception;

	public T queryByUniqueKey(String unique,Serializable uniqueArg) throws Exception;

}
