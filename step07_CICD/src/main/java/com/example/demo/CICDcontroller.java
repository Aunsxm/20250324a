package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDcontroller {
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRes() *******");
		return "요청 응답 성공";
	}
	

}
