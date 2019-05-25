package com.skilldistillery.Jet;

import java.util.List;

//import java.io.File;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jet = new JetsApplication();
		jet.run();
	}

	public void run() {
		AirField jets = new AirField();
		Jet [] allJets = jets.getJets();
		//TODO delete this when you are done - output all planes in the airfield
		for (int i = 0; i < allJets.length; i++) {
			System.out.println(allJets[i].toString()); }
		List<Jet> fJets = new FighterJet().getFighters(allJets);
		//TODO delete this when you are done - output fighter planes
		for (int i = 0; i < fJets.size(); i++) {
			System.out.println(fJets.toString());}
		List<Jet> cJets = new CargoPlane().getCargos(allJets);
		for (int i = 0; i < cJets.size(); i++) {
			System.out.println(cJets.toString());}
	}
}
