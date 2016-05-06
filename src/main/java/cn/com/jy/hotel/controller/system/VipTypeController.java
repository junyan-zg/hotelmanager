/**   
* @Title: VipTypeController.java 
* @Package cn.com.jy.hotel.controller.system 
* @Description: TODO 
* @author zjy   
* @date 2016年5月6日 上午3:30:19 
* @version V1.0   
*/ 
package cn.com.jy.hotel.controller.system;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.domain.guest.GVipType;
import cn.com.jy.hotel.domain.guest.sub.GVipTypeSub;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.guest.GVipTypeService;

/** 
 * @ClassName: VipTypeController 
 * @Description: TODO 
 * @author zjy
 * @date 2016年5月6日 上午3:30:19 
 *  
 */
@Controller
@RequestMapping("/su/system")
public class VipTypeController {
	
	@Resource
	private GVipTypeService gVipTypeService;
	
	@RequestMapping("/getVipTypes")
	public String getVipType(HttpServletRequest request) throws Exception{
		request.setAttribute("vipTypeCount", gVipTypeService.getCount(true));
		return "/su/system/vipType";
	}
	
	@ResponseBody
	@RequestMapping("/getVipTypeCount")
	public Long getVipTypeCount() throws Exception{
		return gVipTypeService.getCount(true);
	}
	
	@ResponseBody
	@RequestMapping("/getVipTypeByPages/{pageNumber}/{pageSize}")
	public List<GVipTypeSub> getByPages(@PathVariable Integer pageNumber,
			@PathVariable Integer pageSize) throws Exception {
		if (pageSize == 0) {
			pageSize = null;
		}
		return gVipTypeService.getByPages(pageNumber, pageSize);
	}

	@ResponseBody
	@RequestMapping("/addVipType")
	public void addVipType(GVipType gVipType) throws Exception {
		try {
			gVipTypeService.add(gVipType);
		} catch (Exception e) {
			throw new MyException("添加失败，已存在一个同名的会员类型名称", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/updateVipType")
	public void updateVipType(GVipType gVipType) throws Exception {
		try {
			gVipTypeService.update(gVipType);
		} catch (Exception e) {
			throw new MyException("更新失败，已存在一个同名的会员类型名称", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/delVipType")
	public void delVipType(Short id) throws Exception {
		try {
			gVipTypeService.delete(id);
		} catch (Exception e) {
			throw new MyException("删除失败，因为存在该会员类型的会员", (short) 0);
		}
	}
}
