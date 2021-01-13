package com.bmw.lifecycleCallbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
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
	public void destroy() throws Exception {
		System.out.println("Disposable bean destroy method");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean afterProperties method");
		
	}
	

}
