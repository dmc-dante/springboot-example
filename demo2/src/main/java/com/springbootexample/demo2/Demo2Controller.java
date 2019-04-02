package com.springbootexample.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Demo2Controller {

	@Autowired HttpServletRequest request;

	@RequestMapping("index")
	public String index() {
		request.setAttribute( "name", "my name is duke");
		return  "index";
	}

	@RequestMapping("model")
	public String model(Model model) {
		model.addAttribute("name", "my name is duke too");
//		request.setAttribute( "name", "my name is duke");
		return  "model";
	}

}
