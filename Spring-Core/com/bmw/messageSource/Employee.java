package com.bmw.messageSource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Employee {
	private int empId;
	private String empName;
	@Autowired
	private MessageSource messageSource;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public void disp() {
		Object[] objects= {getEmpName(),getEmpId()};
		System.out.println(messageSource.getMessage("disp",objects,"Default message",Locale.US));
		System.out.println(messageSource.getMessage("disp",objects,"Default message",Locale.FRANCE));
		System.out.println(messageSource.getMessage("disp",objects,"Default message",Locale.GERMANY));
	}

}
