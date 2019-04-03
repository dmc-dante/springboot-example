package com.springbootexample.demoautoupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoAutoUpdateController {

	@Autowired HttpServletRequest request;

	@RequestMapping("index")
	public String index() {
		request.setAttribute( "name", "my name is duke。修改java类不需要重启!~");

		return  "index";
	}


}
