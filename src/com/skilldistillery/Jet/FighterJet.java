package com.skilldistillery.Jet;

public class FighterJet extends Jet implements CombatReady {


	public FighterJet(String model, String type, double speed, int range, long price) {
		super(model, type, speed, range, price);

	}


	@Override
	public void flight() {
		
	}
}
