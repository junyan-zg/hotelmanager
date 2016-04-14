/**   
* @Title: BaseTest.java 
* @Package cn.com.jy.hotel.dao 
* @Description: TODO 
* @author zjy   
* @date 2016年4月3日 上午3:09:56 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @ClassName: BaseTest 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月3日 上午3:09:56 
 *  
 */
public abstract class BaseTest<T> {
	
	protected ApplicationContext applicationContext;
	
	protected T service ;
	
	private String serviceName;
	
	public BaseTest(String serviceName) {
		this.serviceName = serviceName;
	}
	
	@SuppressWarnings("unchecked")
	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		service = (T) getBean(serviceName);
	}
	
	private Object getBean(String daoName){
		return applicationContext.getBean(daoName);
	}
	
	public abstract void add();

	public abstract void update();

	public abstract void delete();

	public abstract void getById();

	public abstract void getByIds();

	public abstract void getAll();

	public abstract void queryByConditions();

	public abstract void queryByPrimaryKeys() throws Exception;
}
