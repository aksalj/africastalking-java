package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.africastalking.sms.Message;
import com.africastalking.AfricasTalking;
import com.africastalking.SmsService;
import com.africastalking.sms.Recipient;
import com.example.demo.config.SmsConfiguration;

/**
 * 
 * @author denniske
 *
 */

@Service("africastalking")
public class AtSmsSender implements SmsSender {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SmsRequest.class);
	
	private final SmsConfiguration smsConfiguration;
	
	@Autowired
	AtSmsSender(SmsConfiguration smsConfiguration){
 	this.smsConfiguration = smsConfiguration;
	}

	@Override
	public void sendSms(SmsRequest smsRequest) {
		
		if(isPhoneNumberValid(smsRequest.getRecipients())) {
			
			String from = "XXXXX";
			String message = smsRequest.getMessage();
			String[] recipients = smsRequest.getRecipients();
			
			SmsService sms = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
			try {
				List<Recipient> response = sms.send(message, from, recipients, true);
				for (Recipient recipient : response) {
				
					System.out.print(recipient.number);
					System.out.print(" : ");
					System.out.println(recipient.status);
				}
				LOGGER.info("Send sms {}", smsRequest);
			} catch(Exception ex) {
				ex.printStackTrace();
			}

		}
		
				
		
	}
    
	
	/**
	 * validate the phone numbers recipent
	 * @param strings
	 * @return
	 */
	private boolean isPhoneNumberValid(String[] strings) {
		// TODO Auto-generated method stub
		return true;
	}
	

	

}
