package cn.com.jy.hotel.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;

import cn.com.jy.hotel.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;
	private Class<T> class_T;
	private ClassMetadata classMetadata;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BaseDaoImpl() {
		/**
		 * this代表子类对象
		 * 如果给BaseDaoImpl实例化，并且没有传递参数，那么BaseDaoImpl创建的实例对象为class类型，而不是
		 */
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		this.class_T = (Class) type.getActualTypeArguments()[0];
	}

	@PostConstruct
	// 构造函数1，赋值2，这个3
	public void init() {
		this.classMetadata = this.sessionFactory.getClassMetadata(this.class_T);
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public void add(T t) throws Exception {

		this.getSession().save(t);
	}

	public void update(T t) throws Exception {

		this.getSession().update(t);
	}

	public void delete(Serializable id) throws Exception {

		this.getSession().delete(this.getById(id));
	}

	@SuppressWarnings("unchecked")
	public T getById(Serializable id) throws Exception {

		return (T) this.getSession().get(class_T, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll(boolean useCache) throws Exception {

		String hql = "from " + this.class_T.getName();
		Query query = this.getSession().createQuery(hql);
		return query.setCacheable(useCache).list();
	}

	@SuppressWarnings("unchecked")
	public List<T> getByIds(Serializable[] ids, boolean useCache)
			throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("from " + this.class_T.getName());
		sb.append(" where " + this.classMetadata.getIdentifierPropertyName());
		sb.append(" in (");
		for (int i = 0; i < ids.length; i++) {
			if (i == ids.length - 1) {
				sb.append("?");
			} else {
				sb.append("?,");
			}
		}
		sb.append(")");
		Query query = this.getSession().createQuery(sb.toString());
		for (int i = 0; i < ids.length; i++) {
			query.setParameter(i, ids[i]);
		}
		return query.setCacheable(useCache).list();
	}

	@SuppressWarnings("unchecked")
	public List<T> queryByConditions(String where, Serializable[] whereArgs,
			String groupBy, String orderBy, Integer limitOffset,
			Integer limitCount, boolean useCache) throws Exception {

		StringBuffer sb = new StringBuffer();
		sb.append("from " + this.class_T.getName());
		if (where != null && where.length() != 0) {
			sb.append(" where " + where);
			sb.append(" in (");
			for (int i = 0; i < whereArgs.length; i++) {
				if (i == whereArgs.length - 1) {
					sb.append("?");
				} else {
					sb.append("?,");
				}
			}
			sb.append(")");
		}
		if (groupBy != null && groupBy.length() != 0) {
			String str = " group by " + groupBy;
			sb.append(str);
		}
		if (orderBy != null && orderBy.length() != 0) {
			String sort = " order by " + orderBy;
			sb.append(sort);
		}
		Query query = this.getSession().createQuery(sb.toString());
		if (limitOffset != null && limitCount != null) {
			query.setFirstResult(limitOffset);
			query.setMaxResults(limitCount);
		}
		for (int i = 0; i < whereArgs.length; i++) {
			query.setParameter(i, whereArgs[i]);
		}
		return query.setCacheable(useCache).list();
	}

	@SuppressWarnings("unchecked")
	public List<T> queryByPrimaryKeys(Serializable[] ids, boolean orderByAsc,
			Integer limitOffset, Integer limitCount, boolean useCache)
			throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("from " + this.class_T.getName());
		if (ids != null && ids.length != 0) {
			sb.append(" where "
					+ this.classMetadata.getIdentifierPropertyName());
			sb.append(" in (");
			for (int i = 0; i < ids.length; i++) {
				if (i == ids.length - 1) {
					sb.append("?");
				} else {
					sb.append("?,");
				}
			}
			sb.append(")");
		}
		String sort = " order by "
				+ this.classMetadata.getIdentifierPropertyName()
				+ (orderByAsc == true ? " asc" : " desc");
		sb.append(sort);
		Query query = this.getSession().createQuery(sb.toString());
		if (ids != null && ids.length != 0) {
			for (int i = 0; i < ids.length; i++) {
				query.setParameter(i, ids[i]);
			}
		}
		if (limitOffset != null && limitCount != null) {
			query.setFirstResult(limitOffset);
			query.setMaxResults(limitCount);
		}
		return query.setCacheable(useCache).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T queryByUniqueKey(String unique, Serializable uniqueArg)
			throws Exception {
		if (uniqueArg == null)
			return null;
		String hql = "from " + this.class_T.getName() + " where " + unique
				+ " = ?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, uniqueArg);
		return (T) query.uniqueResult();
	}

	@Override
	public int delByConditions(String where, Set<?> whereArgs) throws Exception {
		if (where == null || whereArgs == null || whereArgs.size() == 0)
			return 0;
		String hql = "delete from " + this.class_T.getName() + " where "
				+ where;
		StringBuffer sb = new StringBuffer();
		sb.append(hql);
		sb.append(" in (");
		for (int i = 0; i < whereArgs.size(); i++) {
			if (i == whereArgs.size() - 1) {
				sb.append("?");
			} else {
				sb.append("?,");
			}
		}
		sb.append(")");
		Query query = this.getSession().createQuery(sb.toString());
		int i = 0;
		for (Object arg : whereArgs) {
			query.setParameter(i++, arg);
		}
		return query.executeUpdate();
	}

	public Long getCount(boolean useCache) throws Exception {
		String hql = "select count("
				+ this.classMetadata.getIdentifierPropertyName() + ") from "
				+ this.class_T.getName();
		Query query = this.getSession().createQuery(hql);
		return (long) query.setCacheable(useCache).uniqueResult();
	}
}
