/**   
* @Title: BaseTest.java 
* @Package cn.com.jy.hotel.dao 
* @Description: TODO 
* @author zjy   
* @date 2016年4月3日 上午3:09:56 
* @version V1.0   
*/ 
package cn.com.jy.hotel.test.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * @ClassName: BaseTest 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月3日 上午3:09:56 
 *  
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseTest {
	
	public abstract void add();

	public abstract void update();

	public abstract void delete();

	public abstract void getById() throws Exception;

	public abstract void getByIds() throws Exception;

	public abstract void getAll();

	public abstract void queryByConditions();

	public abstract void queryByPrimaryKeys() throws Exception;
}
