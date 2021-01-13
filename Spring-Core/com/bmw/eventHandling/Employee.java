package com.bmw.eventHandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Employee implements ApplicationEventPublisherAware{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		CustomEvent customEvent=new CustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}
	

}
