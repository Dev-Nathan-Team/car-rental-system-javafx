package com.nathan.yang.controllers;

import java.util.List;

import com.nathan.yang.models.CarRentalSystem;

public class ModelController {
	static CarRentalSystem instance;

	private static void check() {
		if (instance == null) {
			System.out.println("Not initialized, generate new instance.");
			instance = CarRentalSystem.getInstance();
		}
	}

	public static void addNewCar() {
		check();
		instance.add();
	}

	public static void removeCar(int index) {
		check();
		instance.remove(index);
	}

	public static List<String> getCarList() {
		check();
		return instance.getCarStringList();
	}

}
