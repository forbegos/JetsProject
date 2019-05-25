package com.skilldistillery.Jet;

//import java.io.File;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jet = new JetsApplication();
		jet.run();

	}

	public void run() {
		AirField jets = new AirField();
		Jet [] printJets = jets.getJets();
		//TODO delete this when you are done.
		for (int  i = 0;  i < printJets.length; i ++) {
			System.out.println(printJets[i].toString()); }
	}

}
