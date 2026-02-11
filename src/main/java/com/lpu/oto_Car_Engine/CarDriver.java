package com.lpu.oto_Car_Engine;

public class CarDriver {
	
	public static void main(String[] args) {
		CarCRUD cc = new CarCrudImp();
		
		cc.findByBrand("BMW");
	}
}
