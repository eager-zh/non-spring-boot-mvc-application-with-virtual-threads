package com.github.mvcexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.mvcexample.service.HomeService;
import com.github.mvcexample.util.ThreadUtil;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		homeService.goHome();
		homeService.goHomeVirtually();
		return ThreadUtil.dumpInvocation();
	}

}
