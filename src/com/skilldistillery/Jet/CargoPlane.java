package com.skilldistillery.Jet;

import java.util.ArrayList;
import java.util.List;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price); 	}

	public CargoPlane() {	}

	public List<Jet> getCargos(List<Jet> fleet) {
		List<Jet> cargoJets = new ArrayList<>();
		AirField allJets = new AirField();
		fleet = allJets.getJets();
		for (Jet cargo : fleet) {
			if ((cargo.getType().equals("cargo"))) {
				cargoJets.add(cargo);
			}
		}
		return cargoJets;
	}

	public void loadCargo() {
		System.out.println("Loading cargo... ");
	}

}
