package cn.com.jy.hotel.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.service.BaseService;

/** 
* @ClassName: BaseServiceImpl 
* @Description: TODO 
* @author zjy
* @date 2016年4月14日 上午10:37:41 
* 
* @param <T> 
*/ 
public abstract class BaseServiceImpl<T> implements BaseService<T>{

	protected abstract BaseDao<T> getBaseDao();
	
	@Override
	public int delByConditions(String where, Set<?> whereArgs)
			throws Exception {
		return getBaseDao().delByConditions(where, whereArgs);
	}

	public void add(T t) throws Exception {
		getBaseDao().add(t);
	}

	public void update(T t) throws Exception {
		getBaseDao().update(t);
	}

	public void delete(Serializable id) throws Exception {
		getBaseDao().delete(id);
	}

	public T getById(Serializable id) throws Exception {
		return getBaseDao().getById(id);
	}

	public List<T> getByIds(Serializable[] ids,boolean useCache) throws Exception {
		return getBaseDao().getByIds(ids,useCache);
	}
	
	public List<T> getAll(boolean useCache) throws Exception {
		return getBaseDao().getAll(useCache);
	}

	@Override
	public List<T> queryByConditions(String where, String[] whereArgs,
			String groupBy, String orderBy, Integer limitOffset,
			Integer limitCount,boolean useCache) throws Exception {
		return getBaseDao().queryByConditions(where, whereArgs, groupBy, orderBy, limitOffset, limitCount,useCache);
	}

	@Override
	public List<T> queryByPrimaryKeys(Serializable[] ids, boolean orderByAsc,
			Integer limitOffset, Integer limitCount,boolean useCache) throws Exception {
		return getBaseDao().queryByPrimaryKeys(ids, orderByAsc, limitOffset, limitCount,useCache);
	}
	
	@Override
	public T queryByUniqueKey(String unique,Serializable uniqueArg) throws Exception{
		return getBaseDao().queryByUniqueKey(unique, uniqueArg);
	}


}
