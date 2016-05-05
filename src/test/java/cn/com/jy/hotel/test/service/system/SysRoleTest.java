/**   
* @Title: SysRoleTest.java 
* @Package cn.com.jy.hotel.dao.system 
* @Description: TODO 
* @author zjy   
* @date 2016年4月14日 上午9:48:14 
* @version V1.0   
*/ 
package cn.com.jy.hotel.test.service.system;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.domain.room.RRoom;
import cn.com.jy.hotel.domain.room.RRoomGroup;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;
import cn.com.jy.hotel.domain.room.RRoomType;
import cn.com.jy.hotel.domain.system.SysPrivilege;
import cn.com.jy.hotel.domain.system.SysRole;
import cn.com.jy.hotel.service.guest.GVipTypeService;
import cn.com.jy.hotel.service.room.RRoomGroupService;
import cn.com.jy.hotel.service.room.RRoomPayMethodService;
import cn.com.jy.hotel.service.room.RRoomService;
import cn.com.jy.hotel.service.room.RRoomTypeService;
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
	@Resource
	private RRoomGroupService rRoomGroupService;
	@Resource
	private RRoomTypeService rRoomTypeService;
	@Resource
	private RRoomService rRoomService;
	@Resource
	private RRoomPayMethodService rRoomPayMethodService;
	
	@Resource
	private GVipTypeService gVipTypeService;
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
		List<SysRole> ids = sysRoleService.getByIds(new Short[]{1,3,4},false);
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
		List<SysRole> list = sysRoleService.queryByPrimaryKeys(new Short[]{1,3,4},false,1,2,false);
		for (SysRole sysRole : list) {
			Set<SysPrivilege> sysPrivileges = sysRole.getSysPrivileges();
			for (SysPrivilege sysPrivilege : sysPrivileges) {
				System.err.println(sysPrivilege.getName());
			}
		}
	}

	@Test
	public void hh() throws Exception{
		System.out.println(rRoomGroupService.getCount(true));
	}
	@Test
	public void hh2() throws Exception{
		for (int i = 0; i < 233; i++) {
			RRoomType roomType = new RRoomType("单人房"+i, (short)1, new BigDecimal(200));
			rRoomTypeService.add(roomType);
		}
	}
	@Test
	public void hh3() throws Exception{
		for (int i = 0; i < 233; i++) {
			RRoom rRoom = new RRoom(rRoomGroupService.getById((short)4), rRoomTypeService.getById((short)3), "abc"+i, (byte)1, null, null);
			rRoomService.add(rRoom);
		}
	}
	
	@Test
	public void hh4() throws Exception{
		for (int i = 0; i < 233; i++) {
			rRoomPayMethodService.add(new RRoomPayMethod(rRoomTypeService.getById((short)4), "hh4--"+i, 60, new BigDecimal(60), 60,new BigDecimal(50), 40, new BigDecimal(40), (byte)0, (byte)0, null, null, null, null));
		}
	}
	
	@Test
	public void hh5() throws Exception{
		Date date = new Date();
		Date date2 = new Date(date.getTime());
		date2.setDate(date2.getDate()+1);
		for (int i = 0; i < 233; i++) {
			rRoomPayMethodService.add(new RRoomPayMethod(rRoomTypeService.getById((short)4), "hh5--"+i, null, null, null,null, null, null, (byte)0, (byte)1, date, date2, new BigDecimal(300), null));
		}
	}
	@Test
	public void hh6() throws Exception{
		for (int i = 0; i < 233; i++) {
			gVipTypeService.add(new GVipType("会员类型"+i, (byte)(9.9*10), "哈哈哈", null));
		}
	}
}
