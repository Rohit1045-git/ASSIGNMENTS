package com.consumer;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {
	
	private String messageId;
	private String message;
	private Date messageDate;
	public void setMessageId(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setMessageDate(Date date) {
		// TODO Auto-generated method stub
		
	}

}
