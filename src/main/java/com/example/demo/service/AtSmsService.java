package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * @author denniske
 *
 */

@Service
public class AtSmsService {
	
	private final AtSmsSender atSmsSender;
	
	@Autowired
	public AtSmsService(@Qualifier("africastalking") AtSmsSender atSmsSender) {
		this.atSmsSender = atSmsSender;
	}
	
	public void sendSms(SmsRequest smsRequest) {
		atSmsSender.sendSms(smsRequest);
	}

}
