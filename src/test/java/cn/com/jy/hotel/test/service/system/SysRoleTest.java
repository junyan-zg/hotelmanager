/**   
* @Title: SysRoleTest.java 
* @Package cn.com.jy.hotel.dao.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午9:48:14 
* @version V1.0   
*/ 
package cn.com.jy.hotel.test.service.system;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

import cn.com.jy.hotel.domain.system.SysPrivilege;
import cn.com.jy.hotel.domain.system.SysRole;
import cn.com.jy.hotel.service.system.SysRoleService;
import cn.com.jy.hotel.test.service.BaseTest;
import cn.com.jy.hotel.test.service.BaseTest;

/** 
 * @ClassName: SysRoleTest 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午9:48:14 
 *  
 */
public class SysRoleTest extends BaseTest{

	@Resource
	private SysRoleService sysRoleService;
	/* (non-Javadoc)
	* <p>Title: add</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#add() 
	*/ 
	@Test
	@Override
	public void add() {
		System.out.println(sysRoleService);
	}

	/* (non-Javadoc)
	* <p>Title: update</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#update() 
	*/ 
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	* <p>Title: delete</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#delete() 
	*/ 
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	* <p>Title: getById</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#getById() 
	*/ 
	@Test
	@Override
	public void getById() throws Exception {
		// TODO Auto-generated method stub
		SysRole sysRole = sysRoleService.getById((short)1);
			Set<SysPrivilege> sysPrivileges = sysRole.getSysPrivileges();
			for (SysPrivilege sysPrivilege : sysPrivileges) {
				System.err.println(sysPrivilege.getName());
			}
	}

	/* (non-Javadoc)
	* <p>Title: getByIds</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#getByIds() 
	*/ 
	@Test
	@Override
	public void getByIds() throws Exception {
		// TODO Auto-generated method stub
		List<SysRole> ids = sysRoleService.getByIds(new Short[]{1,3,4});
		for (SysRole sysRole : ids) {
			Set<SysPrivilege> sysPrivileges = sysRole.getSysPrivileges();
			for (SysPrivilege sysPrivilege : sysPrivileges) {
				System.err.println(sysPrivilege.getName());
			}
		}
	}

	/* (non-Javadoc)
	* <p>Title: getAll</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#getAll() 
	*/ 
	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	* <p>Title: queryByConditions</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#queryByConditions() 
	*/ 
	@Override
	public void queryByConditions() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	* <p>Title: queryByPrimaryKeys</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#queryByPrimaryKeys() 
	*/ 
	@Test
	@Override
	public void queryByPrimaryKeys() throws Exception {
		List<SysRole> list = sysRoleService.queryByPrimaryKeys(new Short[]{1,3,4},false,1,2);
		for (SysRole sysRole : list) {
			Set<SysPrivilege> sysPrivileges = sysRole.getSysPrivileges();
			for (SysPrivilege sysPrivilege : sysPrivileges) {
				System.err.println(sysPrivilege.getName());
			}
		}
	}

}
