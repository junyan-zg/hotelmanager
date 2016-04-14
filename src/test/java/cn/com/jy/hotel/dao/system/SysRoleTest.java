/**   
* @Title: SysRoleTest.java 
* @Package cn.com.jy.hotel.dao.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午9:48:14 
* @version V1.0   
*/ 
package cn.com.jy.hotel.dao.system;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import cn.com.jy.hotel.dao.BaseTest;
import cn.com.jy.hotel.domain.system.SysPrivilege;
import cn.com.jy.hotel.domain.system.SysRole;
import cn.com.jy.hotel.service.system.SysRoleService;

/** 
 * @ClassName: SysRoleTest 
 * @Description: TODO 
 * @author zjy
 * @date 2016年4月14日 上午9:48:14 
 *  
 */
public class SysRoleTest extends BaseTest<SysRoleService>{

	public SysRoleTest() {
		super("sysRoleService");
	}

	/* (non-Javadoc)
	* <p>Title: add</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#add() 
	*/ 
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
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
	@Override
	public void getById() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	* <p>Title: getByIds</p> 
	* <p>Description: </p>  
	* @see cn.com.jy.hotel.dao.BaseTest#getByIds() 
	*/ 
	@Override
	public void getByIds() {
		// TODO Auto-generated method stub
		
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
		List<SysRole> list = service.queryByPrimaryKeys(new Short[]{1,3,4},false,0,5);
		for (SysRole sysRole : list) {
			Set<SysPrivilege> sysPrivileges = sysRole.getSysPrivileges();
			for (SysPrivilege sysPrivilege : sysPrivileges) {
				System.err.println(sysPrivilege.getName());
			}
		}
	}

}
