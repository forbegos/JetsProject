package com.skilldistillery.Jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private Jet[] jets;

	public AirField() {
	}

	public Jet[] getJets() {
		List<Jet> test = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			int fileLineCount = 0;
			while ((line = br.readLine()) != null) {
				String[] jetRead = line.split(",");
				String type = jetRead[0];
				String model = jetRead[1];
				double speed = Double.parseDouble(jetRead[2]);
				int range = Integer.parseInt(jetRead[3]);
				long price = Long.parseLong(jetRead[4]);
				Jet newJet = new JetImpl(type, model, speed, range, price);
				test.add(newJet);
				fileLineCount += 1;
			}
			//TODO remember to change test name to something better.
			this.jets = new Jet[fileLineCount - 1];
			for (int i = 0; i < jets.length; i++) {
				jets[i] = test.get(i);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return jets;
	}
}
