package com.github.mvcexample.service;

import org.springframework.scheduling.annotation.Async;

import com.github.mvcexample.util.ThreadUtil;

public class HomeService {
	
	@Async("virtualExecutor")
	public void goHomeVirtually() {
		ThreadUtil.dumpInvocation();
	}

	@Async("platformExecutor")
	public void goHome() {
		ThreadUtil.dumpInvocation();
	}

}
