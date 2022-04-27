package com.rabbit.JMS;

import java.sql.Date;

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
}
