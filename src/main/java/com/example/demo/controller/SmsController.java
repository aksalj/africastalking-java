package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.AtSmsService;
import com.example.demo.service.SmsRequest;
/**
 * 
 * @author denniske
 *
 */


@Controller
@RequestMapping("Api/v1/sms")
public class SmsController {
	
private final AtSmsService atSmsService;
	
	
	@Autowired
	public SmsController(AtSmsService atSmsService) {
		this.atSmsService = atSmsService;
	}
	
	/*
	 * sending json data
	 * 
	@PostMapping("/send")
	public void SendSms(@Valid @RequestBody SmsRequest smsRequest) {
		smsService.sendSms(smsRequest);
	}
	*/
	@PostMapping("/send")
	public void SendSms( SmsRequest smsRequest) {
		atSmsService.sendSms(smsRequest);
	}


}
