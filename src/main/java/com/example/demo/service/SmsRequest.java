package com.example.demo.service;

import java.util.Arrays;

/**
 * 
 * @author denniske
 *
 */

public class SmsRequest {
	
	private final String message;
	private String[] recipients;
	
	public SmsRequest(String message, String[] recipients) {
		this.message = message;
		this.recipients = recipients;
	}

	public String[] getRecipients() {
		return recipients;
	}


	public void setRecipients(String[] recipients) {
		this.recipients = recipients;
	}


	public String getMessage() {
		return message;
	}


	
	
	
	@Override
	public String toString() {
		return "SmsRequest [message=" + message + ", recipients=" + Arrays.toString(recipients) + "]";
	}
	
	
	
	
	
	
	
	
	



	
	
	
	

}
