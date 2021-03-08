package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.africastalking.AfricasTalking;
/**
 * 
 * @author denniske
 *
 */


@Configuration
public class SmsInitializer {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(SmsInitializer.class);
	@Autowired
	public SmsInitializer(SmsConfiguration smsConfiguration) {
		AfricasTalking.initialize(smsConfiguration.getUsername(), smsConfiguration.getApiKey());
		
		
		
		LOGGER.info("AT iniatialized with ApiKey {} ", smsConfiguration.getApiKey());
		
	}
	

}
