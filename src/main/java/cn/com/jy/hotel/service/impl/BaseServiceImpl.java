package cn.com.jy.hotel.service.impl;

import java.io.Serializable;
import java.util.List;

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

	public List<T> getByIds(Serializable[] ids) throws Exception {
		return getBaseDao().getByIds(ids);
	}
	
	public List<T> getAll() throws Exception {
		return getBaseDao().getAll();
	}

	@Override
	public List<T> queryByConditions(String where, String[] whereArgs,
			String groupBy, String orderBy, Integer limitOffset,
			Integer limitCount) throws Exception {
		return getBaseDao().queryByConditions(where, whereArgs, groupBy, orderBy, limitOffset, limitCount);
	}

	@Override
	public List<T> queryByPrimaryKeys(Serializable[] ids, boolean orderByAsc,
			Integer limitOffset, Integer limitCount) throws Exception {
		return getBaseDao().queryByPrimaryKeys(ids, orderByAsc, limitOffset, limitCount);
	}

}
