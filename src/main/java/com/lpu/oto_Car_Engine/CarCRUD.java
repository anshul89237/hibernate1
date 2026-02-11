package com.lpu.oto_Car_Engine;

public interface CarCRUD {
	void saveCar(Car c);
	void updateCarBrand(int id, String name);
	void deleteCar(int id);
	void findCar(int id);
	void findAllCar();
	void findByBrand(String brandName);
}
