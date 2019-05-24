package com.skilldistillery.Jet;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model,String type, double speed, int range, long price) {
		super(model, type, speed, range, price);
	}
	
	public void loadCargo() {
		System.out.println("Loading cargo... ");
		
	}

}
