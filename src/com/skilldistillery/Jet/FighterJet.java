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

	public void listJets() {
		int number = 1;
		System.out.println("The current fighter fleet is composed of the following Fighter Jets: \n");

		for (Jet jet : fighterJets) {
			System.out.println("Jet #" + number + ":");
			System.out.println("Model: " + jet.getModel());
			System.out.println("Speed : " + jet.getSpeed() + " MPH");
			System.out.println("Range: " + jet.getRange() + " Miles");
			System.out.println("Price: USD " + jet.getPrice());
			System.out.println();
			number += 1;
		}
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

