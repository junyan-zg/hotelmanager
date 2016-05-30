/**   
 * @Title: MyExceptionResolver.java 
 * @Package exception 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月17日 上午2:38:49 
 * @version V1.0   
 */
package cn.com.jy.hotel.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.http.WebStatFilter.StatHttpServletResponseWrapper;

/**
 * @ClassName: MyExceptionResolver
 * @Description: TODO
 * @author zjy
 * @date 2016年4月17日 上午2:38:49
 * 
 */
@Component
public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		String exInfo = null;
		short state = 0;// 0源码返回，1跳转页面，2返回封装js
		if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
				.getHeader("X-Requested-With") != null && request.getHeader(
				"X-Requested-With").indexOf("XMLHttpRequest") > -1))) { // 如果不是异步请求
			state = 1;
		} else {// JSON格式返回
			state = 2;
		}
		if (ex instanceof MyException) {
			MyException e = (MyException) ex;
			exInfo = e.getExInfo();
			state = e.getState();
		} else {
			exInfo = ex.getMessage();
		}
		if (state == 0) {
			outSrc(response, exInfo);
			return new ModelAndView();
		} else if (state == 2) {
			out(response, exInfo);
			return new ModelAndView();
		} else if (state == 1) {
			Map<String, String> model = new HashMap<String, String>();
			model.put("exInfo", exInfo);
			return new ModelAndView("/error", model);
		}
		return null;
	}

	private void outSrc(HttpServletResponse response, String info) {
		try {
			PrintWriter writer = response.getWriter();
			writer.write(info);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void out(HttpServletResponse response, String info) {
		try {
			PrintWriter writer = response.getWriter();
			String infoAll = "<script>alert('" + info
					+ "'); window.history.back(-1); </script>";
			writer.write(infoAll);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
