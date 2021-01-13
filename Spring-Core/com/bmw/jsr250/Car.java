package com.bmw.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Car {
	private int id;
	private String name;
	@Resource(name = "apple")
	private Color color;
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@PostConstruct
	public void myInit() {
		System.out.println("Custom initialization method");
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("Custom Destroy method");
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
