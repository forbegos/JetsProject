package com.skilldistillery.Jet;

import java.util.List;
import java.util.ArrayList;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public List<FighterJet> getFighters(Jet[] jets) {
		List<FighterJet> fighterJets = new ArrayList<>();
		AirField allJets = new AirField();
		jets = allJets.getJets();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i].getType().equals("fighter")) {
				fighterJets.add((FighterJet) jets[i]);
			}
		}
		return fighterJets;
	}

	@Override
	public void flight() {
	}
}
