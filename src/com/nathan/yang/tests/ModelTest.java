package com.nathan.yang.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nathan.yang.models.CarRentalSystem;

class ModelTest {

	@Test
	void test() {
		
	 CarRentalSystem system = CarRentalSystem.getInstance();

	 system.add();
	 system.add();
	 system.add();
	 
	 system.show();
	 
	 CarRentalSystem.getInstance().remove(0);
	 CarRentalSystem.getInstance().remove(0);
	 
	}

}
