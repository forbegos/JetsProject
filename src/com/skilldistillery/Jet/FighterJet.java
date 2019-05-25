package com.skilldistillery.Jet;

import java.util.List;
import java.util.ArrayList;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public FighterJet() {
	}

	public List<Jet> getFighters(List<Jet> fleet) {
		List<Jet> fighterJets = new ArrayList<>();
		AirField allJets = new AirField();
		fleet = allJets.getJets();
		for (Jet jet : fleet) {
			if ((jet.getType().equals("fighter"))) {
				fighterJets.add(jet);
			}
		}
		return fighterJets;
	}

	@Override
	public void flight() {
	}
}
