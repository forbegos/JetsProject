package com.skilldistillery.Jet;

import java.util.ArrayList;
import java.util.List;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type,String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public CargoPlane() {}

	public List<Jet> getCargos(Jet[] cargos) {
		List<Jet> cargoJets = new ArrayList<>();
		AirField allJets = new AirField();
		cargos = allJets.getJets();
		for (int i = 0; i < cargos.length; i++) {
			if (cargos[i].getType().equals("cargo")) {
				cargoJets.add(cargos[i]);
			}
		}
		return cargoJets;
	}
	
	
	public void loadCargo() {
		System.out.println("Loading cargo... ");
		
	}

}
