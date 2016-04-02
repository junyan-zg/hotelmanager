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
public abstract class BaseTest {
	
	protected ApplicationContext applicationContext;
	
	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	public abstract void beanInit();
	
	public Object getBean(String mapperName){
		return applicationContext.getBean(mapperName);
	}
	
	public abstract void deleteByPrimaryKey();
	
	public abstract void insert();
	
	public abstract void insertSelective();
	
	public abstract void selectByPrimaryKey();
	
	public abstract void updateByPrimaryKeySelective();
	
	public abstract void updateByPrimaryKey();
}
