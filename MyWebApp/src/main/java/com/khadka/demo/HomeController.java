package com.khadka.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("home")

	public String home() {
		System.out.println("My name is MAHESH.");
		return "Mahesh";
	}
}
