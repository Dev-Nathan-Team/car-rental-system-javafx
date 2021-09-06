package com.nathan.yang.models;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
	
	private static List<Car> carList;
	
	private CarRentalSystem() {
		carList = new ArrayList<>();
	}
	
	static enum SingletonEnum {
		INSTANCE;
		private CarRentalSystem system;
		
		private SingletonEnum() {
			system = new CarRentalSystem();
		}
		public CarRentalSystem getInstance() {
			return system;
		}
	}
	
	public void add() {
		carList.add(new Car());
		show();
	}
	
	public void show() {
		System.out.println(carList.toString());
		System.out.println(carList.size());
		return ;
	}
	
	public void remove(int index) {
		carList.remove(index);
		show();
	}
	
	public List<String> getCarStringList(){
		List<String> temp = new ArrayList<>();
		for(Car c: carList) {
			temp.add(c.toString());
		}
		return temp;
	}
	
	public static CarRentalSystem getInstance() {
		return SingletonEnum.INSTANCE.getInstance();
	}

}
