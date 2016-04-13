package cn.com.jy.hotel.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;

import cn.com.jy.hotel.dao.BaseDao;


public class BaseDaoImpl<T> implements BaseDao<T>{
	
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
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.class_T = (Class) type.getActualTypeArguments()[0];
	}
	
	@PostConstruct		//构造函数1，赋值2，这个3
	public void init(){
		this.classMetadata = this.sessionFactory.getClassMetadata(this.class_T);
	}
	
	public Session getSession(){
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
	public List<T> getAll() throws Exception {

		String hql = "from " + this.class_T.getName();
		Query query = this.getSession().createQuery(hql);
		return query.list();
	}


	@SuppressWarnings("unchecked")
	public List<T> getByIds(Serializable[] ids) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("from "+this.class_T.getName());
		sb.append(" where "+this.classMetadata.getIdentifierPropertyName());
		sb.append(" in (");
		for (int i = 0; i < ids.length; i++) {
			if(i==ids.length-1){
				sb.append("?");
			}else{
				sb.append("?,");
			}
		}
		sb.append(")");
		Query query = this.getSession().createQuery(sb.toString());
		for(int i = 0;i<ids.length;i++){
			query.setParameter(i, ids[i]);
		}
		return query.list();
	}

}
