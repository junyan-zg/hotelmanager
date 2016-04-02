/**   
* @Title: TestErrorLog.java 
* @Package cn.com.jy.hotel.dao.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月3日 上午4:45:10 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.system;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import cn.com.jy.hotel.dao.BaseTest;
import cn.com.jy.hotel.domain.system.SysErrorLog;

/** 
 * @ClassName: TestErrorLog 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月3日 上午4:45:10 
 *  
 */
public class TestSysErrorLog extends BaseTest{
	
	SysErrorLogMapper sysErrorLogMapper;
	
	
	@Before
	@Override
	public void beanInit() {
		sysErrorLogMapper = (SysErrorLogMapper) getBean("sysErrorLogMapper");
	}

	@Test
	@Override
	public void deleteByPrimaryKey() {
		int deleteByPrimaryKey = sysErrorLogMapper.deleteByPrimaryKey(4l);
		System.out.println(deleteByPrimaryKey);
	}

	@Test
	@Override
	public void insert() {
		SysErrorLog log = new SysErrorLog();
		log.setEventTime(new Date());
		log.setIp_address("192.168.1.100");
		log.setDescription("卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽");
		log.setOperator_id(1);
		int e = sysErrorLogMapper.insert(log);
		System.out.println("影响："+e);
		System.out.println("id" + log.getId());
	}

	@Test
	@Override
	public void insertSelective() {
		SysErrorLog log = new SysErrorLog();
		log.setEventTime(new Date());
		log.setIp_address("192.168.1.100");
		log.setDescription("卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽卧槽");

		int e = sysErrorLogMapper.insert(log);
		System.out.println("影响："+e);
		System.out.println("id" + log.getId());
	}

	@Test
	@Override
	public void selectByPrimaryKey() {
		SysErrorLog log = sysErrorLogMapper.selectByPrimaryKey(2l);
		System.out.println(log.getDescription());
		System.out.println(log.getEventTime());
		System.out.println(log.getIp_address());
		System.out.println(log.getOperator_id());
	}

	@Test
	@Override
	public void updateByPrimaryKeySelective() {
		SysErrorLog log = sysErrorLogMapper.selectByPrimaryKey(2l);
		log.setDescription("哈哈aa2244444444444");
		int i = sysErrorLogMapper.updateByPrimaryKeySelective(log);
		System.out.println(i);
	}

	@Test
	@Override
	public void updateByPrimaryKey() {
		SysErrorLog log = sysErrorLogMapper.selectByPrimaryKey(2l);
		log.setDescription("哈哈aa2244444444444");
		int i = sysErrorLogMapper.updateByPrimaryKey(log);
		System.out.println(i);
	}
	
	@Test
	public void updateByPrimaryKeyWithBLOBs() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 65535; i++) {
			sb.append("q");
		}
		System.out.println(sb.toString().length());
		SysErrorLog log = sysErrorLogMapper.selectByPrimaryKey(2l);
		log.setDescription("呵呵呵");
		int i = sysErrorLogMapper.updateByPrimaryKeyWithBLOBs(log);
		System.out.println(i);
	}
}
