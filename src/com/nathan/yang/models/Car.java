package com.nathan.yang.models;

public class Car {
	private String randomStr;

	public Car() {
		this.randomStr = System.nanoTime() + "";
	}

	@Override
	public String toString() {
		return "Car [randomStr=" + randomStr + "]";
	}

}
