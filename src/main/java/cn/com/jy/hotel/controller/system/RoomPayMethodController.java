/**   
 * @Title: RoomController.java 
 * @Package cn.com.jy.hotel.controller.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月25日 上午2:36:54 
 * @version V1.0   
 */
package cn.com.jy.hotel.controller.system;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jy.hotel.data.Helper;
import cn.com.jy.hotel.data.RoomPayMethodStatusMap;
import cn.com.jy.hotel.domain.room.RRoomPayMethod;
import cn.com.jy.hotel.domain.room.sub.RoomPayMethodSub1;
import cn.com.jy.hotel.domain.room.sub.RoomPayMethodSub2;
import cn.com.jy.hotel.exception.MyException;
import cn.com.jy.hotel.service.room.RRoomPayMethodService;
import cn.com.jy.hotel.service.room.RRoomTypeService;

/**
 * @ClassName: RoomPayMethodController
 * @Description: TODO
 * @author zjy
 * @date 2016年4月25日 上午2:36:54
 * 
 */
@Controller
@RequestMapping("/su/system")
public class RoomPayMethodController {
	@Resource
	private RRoomTypeService rRoomTypeService;
	@Resource
	private RRoomPayMethodService rRoomPayMethodService;

	@ResponseBody
	@RequestMapping("/getRoomPayMethodCount/{payType}")
	public Long getRoomPayMethodCount(@PathVariable Byte payType)
			throws Exception {
		return rRoomPayMethodService.getRoomPayMethodCount(payType, true);
	}

	@ResponseBody
	@RequestMapping("/getRoomPayMethodAllByPages/{payType}/{pageNumber}/{pageSize}")
	public List<?> getRoomPayMethodAllByPages(@PathVariable Byte payType,
			@PathVariable Integer pageNumber, @PathVariable Integer pageSize)
			throws Exception {
		return rRoomPayMethodService.getRoomPayMethodAllByPages(payType,
				pageNumber, pageSize, true);
	}

	@ResponseBody
	@RequestMapping("/getRoomPayMethodStatusAll")
	public List<Helper> getRoomStatusAll() throws Exception {
		return RoomPayMethodStatusMap.getHelperList();
	}

	// 存入日期时只能是这种。
	/*
	 * @InitBinder public void initBinder(HttpServletRequest request,
	 * ServletRequestDataBinder binder) {
	 * binder.registerCustomEditor(Date.class, new CustomDateEditor( new
	 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true)); }
	 */

	@ResponseBody
	@RequestMapping("/addRoomPayMethod1")
	public void addRoomPayMethod1(RoomPayMethodSub1 roomPayMethodSub1)
			throws Exception {
		RRoomPayMethod rRoomPayMethod = new RRoomPayMethod();
		sub1ToRRoomPayMethod(roomPayMethodSub1, rRoomPayMethod);
		try {
			rRoomPayMethodService.add(rRoomPayMethod);
		} catch (Exception e) {
			throw new MyException("添加失败，已存在一个同名的房间计费方案", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/addRoomPayMethod2")
	public void addRoomPayMethod2(RoomPayMethodSub2 roomPayMethodSub2)
			throws Exception {
		Date date1 = new Date();
		Date date2 = new Date(date1.getTime());
		if (!checkTime(roomPayMethodSub2.getCheckInTime(),
				roomPayMethodSub2.getCheckOutTime(), date1, date2)) {
			throw new MyException("添加失败，退房时间点应该比入住时间点早", (short) 0);
		}
		RRoomPayMethod rRoomPayMethod = new RRoomPayMethod();
		rRoomPayMethod.setCheckInTime(date1);
		rRoomPayMethod.setCheckOutTime(date2);
		sub2ToRRoomPayMethod(roomPayMethodSub2, rRoomPayMethod);

		try {
			rRoomPayMethodService.add(rRoomPayMethod);
		} catch (Exception e) {
			throw new MyException("添加失败，已存在一个同名的房间计费方案", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/updateRoomPayMethod1")
	public void updateRoomPayMethod1(RoomPayMethodSub1 roomPayMethodSub1)
			throws Exception {
		RRoomPayMethod rRoomPayMethod = rRoomPayMethodService
				.getById(roomPayMethodSub1.getId());
		sub1ToRRoomPayMethod(roomPayMethodSub1, rRoomPayMethod);
		try {
			rRoomPayMethodService.update(rRoomPayMethod);
		} catch (Exception e) {
			throw new MyException("更新失败，已存在一个同名的房间计费方案", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/updateRoomPayMethod2")
	public void updateRoomPayMethod2(RoomPayMethodSub2 roomPayMethodSub2)
			throws Exception {
		Date date1 = new Date();
		Date date2 = new Date(date1.getTime());
		if (!checkTime(roomPayMethodSub2.getCheckInTime(),
				roomPayMethodSub2.getCheckOutTime(), date1, date2)) {
			throw new MyException("更新失败，退房时间点应该比入住时间点早", (short) 0);
		}
		RRoomPayMethod rRoomPayMethod = rRoomPayMethodService
				.getById(roomPayMethodSub2.getId());
		rRoomPayMethod.setCheckInTime(date1);
		rRoomPayMethod.setCheckOutTime(date2);
		sub2ToRRoomPayMethod(roomPayMethodSub2, rRoomPayMethod);

		try {
			rRoomPayMethodService.update(rRoomPayMethod);
		} catch (Exception e) {
			throw new MyException("更新失败，已存在一个同名的房间计费方案", (short) 0);
		}
	}

	@ResponseBody
	@RequestMapping("/delRoomPayMethod")
	public void delRoomPayMethod(Short id) throws Exception {
		try {
			RRoomPayMethod payMethod = rRoomPayMethodService.getById(id);
			payMethod.setStatus((byte) 2);
			rRoomPayMethodService.update(payMethod);
		} catch (Exception e) {
			throw new MyException("删除失败", (short) 0);
		}
	}

	private void sub1ToRRoomPayMethod(RoomPayMethodSub1 roomPayMethodSub1,
			RRoomPayMethod rRoomPayMethod) throws Exception {
		rRoomPayMethod.setPayMethodName(roomPayMethodSub1.getPayMethodName());
		rRoomPayMethod.setRRoomType(rRoomTypeService.queryByUniqueKey(
				"roomTypeName", roomPayMethodSub1.getRoomTypeName()));
		rRoomPayMethod.setStartupTime(roomPayMethodSub1.getStartupTime());
		rRoomPayMethod.setStartupPrice(roomPayMethodSub1.getStartupPrice());
		rRoomPayMethod.setStandardTime(roomPayMethodSub1.getStandardTime());
		rRoomPayMethod.setStandardPrice(roomPayMethodSub1.getStandardPrice());
		rRoomPayMethod.setMinTime(roomPayMethodSub1.getMinTime());
		rRoomPayMethod.setMinPrice(roomPayMethodSub1.getMinPrice());
		rRoomPayMethod.setStatus(RoomPayMethodStatusMap
				.getByte(roomPayMethodSub1.getStatusName()));
		rRoomPayMethod.setPayType(roomPayMethodSub1.getPayType());
	}

	private void sub2ToRRoomPayMethod(RoomPayMethodSub2 roomPayMethodSub2,
			RRoomPayMethod rRoomPayMethod) throws Exception {
		rRoomPayMethod.setPayMethodName(roomPayMethodSub2.getPayMethodName());
		rRoomPayMethod.setRRoomType(rRoomTypeService.queryByUniqueKey(
				"roomTypeName", roomPayMethodSub2.getRoomTypeName()));
		rRoomPayMethod.setStatus(RoomPayMethodStatusMap
				.getByte(roomPayMethodSub2.getStatusName()));
		rRoomPayMethod.setPayType(roomPayMethodSub2.getPayType());
		rRoomPayMethod.setDayPrice(roomPayMethodSub2.getDayPrice());
		/* 时间在外面设置 */
	}

	/**
	 * 退房时间应该比入住时间点早
	 */
	private static boolean checkTime(String checkInTime, String checkOutTime,
			Date date1, Date date2) {
		String[] time1 = checkInTime.split(":");
		String h1 = time1[0];
		String m1 = time1[1];
		String s1 = time1[2];
		String[] time2 = checkOutTime.split(":");
		String h2 = time2[0];
		String m2 = time2[1];
		String s2 = time2[2];
		date1.setHours(Integer.valueOf(h1));
		date1.setMinutes(Integer.valueOf(m1));
		date1.setSeconds(Integer.valueOf(s1));
		date2.setHours(Integer.valueOf(h2));
		date2.setMinutes(Integer.valueOf(m2));
		date2.setSeconds(Integer.valueOf(s2));
		return date2.getTime() <= date1.getTime();
	}
}
