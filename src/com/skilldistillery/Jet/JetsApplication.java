package com.skilldistillery.Jet;

import java.util.ArrayList;
import java.util.List;


public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jet = new JetsApplication();
		jet.run();
	}

	public void run() {
		List<Jet> allJets = new ArrayList<>();
		AirField jets = new AirField();
		allJets = jets.getJets();
//		// TODO delete this when you are done - output all planes in the airfield
		System.out.println("Fleet: ");
		for (int i = 0; i < allJets.size(); i++) {
			System.out.println(allJets.get(i));
			System.out.println();
		}
		// TODO delete this when you are done - output fighter planes
		System.out.println();
		System.out.println("Fighter Jets: ");
		List<Jet> allFighterJets = new ArrayList<>();
		FighterJet fJets = new FighterJet();
		allFighterJets = fJets.getFighters(allJets);
		for (int i = 0; i < allFighterJets.size(); i++) {
			System.out.println(allFighterJets.get(i));
			System.out.println();
		}
//		// TODO delete this when you are done - output cargo planes
		System.out.println();
		System.out.println("Cargo Jets: ");
		List<Jet> allCargoJets = new ArrayList<>();
		CargoPlane cJets = new CargoPlane();
		allCargoJets = cJets.getCargos(allJets);
		for (int i = 0; i < allCargoJets.size(); i++) {
			System.out.println(allCargoJets.get(i));
			System.out.println();
		}
	}

//	private void displayUserMenu() {
//		System.out.println("-------------------- WELCOME TO THE AIRFIELD --------------------");
//		System.out.println("                                                                                                                       ");
//		System.out.println("--------------------------- MAIN MENU ------------------------------");
//		System.out.println("                                                                                                                       ");
//		System.out.println("PLEASE SELECT FROM THE FOLLOWING OPTIONS:                               ");
//		System.out.println("                                                                                                                       ");
//		System.out.println("(1) List Fleet");
//		System.out.println("(2)  Fly all jets");
//		System.out.println("(3) View fastest jet");
//		System.out.println("(4) View jet with longest range");
//		System.out.println("(5) Load all Cargo Jets");
//		System.out.println("(6) Dogfight!");
//		System.out.println("(7) Add jet to Fleet");
//		System.out.println("(8) Remove a jet from Fleet");
//		System.out.println("(9) Quit");
//	}
//
}
