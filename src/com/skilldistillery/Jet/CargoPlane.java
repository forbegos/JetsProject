package com.skilldistillery.Jet;

import java.util.ArrayList;
import java.util.List;

public class CargoPlane extends Jet implements CargoCarrier {
	private List<Jet> cargoJets = new ArrayList<>();
	private AirField allJets = new AirField();

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public CargoPlane() {
	}

	public List<Jet> getCargos() {
		for (Jet cargo : allJets.getJets()) {
			if ((cargo.getType().equals("cargo"))) {
				cargoJets.add(cargo);
			}
		}
		return cargoJets;
	}

	@Override
	public void loadCargo() {
		getCargos();
		System.out.println("Loading all cargo jets...\n");
		for (Jet jet : cargoJets) {
			System.out.println("Loading cargo on: " + jet.getModel());
		}
	}

	@Override
	public void fly() {
		super.fly();
		}
	}

