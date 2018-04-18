package com.heeexy.example.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usbaby.configration.CorsConfig;
@RestController
@RequestMapping("/test")
public class testController  {
	@RequestMapping(value = "test1", method = RequestMethod.GET)
    public String  test(HttpServletRequest req, HttpServletResponse resp) {
       return "success";
    }
}
