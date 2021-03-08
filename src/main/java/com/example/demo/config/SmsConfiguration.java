package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author denniske
 *
 */

@Configuration
@ConfigurationProperties("africastalking")
public class SmsConfiguration {
	
	private String username;
	private String apiKey;
	
    public SmsConfiguration() {
		
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	
	
	
	

}
