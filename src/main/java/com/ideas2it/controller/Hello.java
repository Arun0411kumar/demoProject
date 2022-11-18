package com.ideas2it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	@RequestMapping("/dfdf")
	public String get() {
		return "new";
	}
}
