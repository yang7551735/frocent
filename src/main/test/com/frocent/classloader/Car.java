package com.frocent.classloader;

public class Car {
	private String brand;
	private int maxSpeed;
	private String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void start(){
		System.out.println("start....");
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
