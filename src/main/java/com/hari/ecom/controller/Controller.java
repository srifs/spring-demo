package com.hari.ecom.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/api/ping")
	public String ping() {
		// TODO Auto-generated method stub
		return "Ping @ " + new Date();
	}
}
