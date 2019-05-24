package com.skilldistillery.Jet;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JetsApplication {
	
	private Airfield airField;
	
	public static void main(String[] args) {
		List<Jet> jetFullList= new ArrayList<> ();
		List<Airfield> cargoPlanes = new ArrayList<>();
		List<Airfield> fighterJets = new ArrayList<>();
		 String fileName = "Jets.txt";
		JetsApplication jet = new JetsApplication();
		jet.run(fileName, jetFullList); 	}

	public  void run(String fileName, List<Jet> jetFullList) {
		readFile( fileName, jetFullList); 	}
	
	public static  List<Jet>readFile (String fileName, List<Jet> listFromFile) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] jets = line.split(",");
				String type = jets[0];
				String model = jets[1];
				double speed = Double.parseDouble(jets[2]);
				int range = Integer.parseInt(jets[3]);
				long price = Long.parseLong(jets[4]);
					FighterJet fj = new FighterJet(type, model, speed, range, price);
					listFromFile.add(fj);	}
		} 	catch (Exception e) {
			e.printStackTrace(); }
		return listFromFile;  	}
	
	public List<Airfield> fillAirfield(List<Jet> jetFullList, List<Airfield> airField) {
		
		return airField;
	}
	
}
