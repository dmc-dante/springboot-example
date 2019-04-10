package com.springbootexample.demojsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class DemoJspController {
	@RequestMapping(value = { "/", "/index" })
	public String index(Map<String, Object> model) {
		// 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
		// 本例为 /WEB-INF/jsp/index.jsp
		model.put("time", new Date());
		return "index";
	}

	/**
	 * 响应到JSP页面page1
	 */
	@RequestMapping("/page1")
	public ModelAndView page1() {
		// 页面位置 /WEB-INF/jsp/page/page.jsp
		ModelAndView mav = new ModelAndView("page/page1");
		mav.addObject("content", "hello");
		return mav;
	}
}
