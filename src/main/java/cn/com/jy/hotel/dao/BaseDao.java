package cn.com.jy.hotel.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface BaseDao<T> {
	public void add(T t) throws Exception;

	public void update(T t) throws Exception;

	public void delete(Serializable id) throws Exception;

	public T getById(Serializable id) throws Exception;

	public List<T> getByIds(Serializable[] ids) throws Exception;

	public List<T> getAll() throws Exception;

	public List<T> queryByConditions(String where, String[] whereArgs,
			String groupBy, String orderBy, Integer limitOffset,
			Integer limitCount) throws Exception;
	
	public int delByConditions(String where,Set<?> whereArgs) throws Exception;
	
	public T queryByUniqueKey(String unique,Serializable uniqueArg) throws Exception;

	public List<T> queryByPrimaryKeys(Serializable[] ids, boolean orderByAsc,
			Integer limitOffset, Integer limitCount) throws Exception;

	// 1、对所有的查询做了一个抽象
	// 2、对所有的表的计算表的行数做了个通用的实现
	// 3、抽象了一个分页PageResult
	// 4、利用了HibernateCallBack技术实现的分页查询
	// PageResult<T> getPageResult(BaseQuery baseQuery);
	// 在对主表进行修改的时候，要根据订单号进行查询
	// T getEntry_Zhu(Serializable ddh);
	/**
	 * 根据订单号和订单状态查询主表 ddh 代表订单号 status 代表订单状态 查询的是未完成的订单,用于修改环节
	 */
	// T getEntry_Zhu(String ddh,String status);

}
