package com.skilldistillery.Jet;

import java.util.List;
import java.util.ArrayList;

public class FighterJet extends Jet implements CombatReady {
	private List<Jet> fighterJets = new ArrayList<>();
	private AirField allJets = new AirField();

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public FighterJet() {
	}

	public List<Jet> getFighters(List<Jet> fleet) {
		for (Jet jet : allJets.getJets()) {
			if ((jet.getType().equals("fighter"))) {
				fighterJets.add(jet);
			}
		}
		return fighterJets;
	}

	@Override
	public void fly() {
		super.fly();
		}

	@Override
	public void fight() {
		System.out.println("Fighter jets are now engaged in Dogfight!");
	}
	}

