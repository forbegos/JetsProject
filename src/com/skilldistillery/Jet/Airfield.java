package com.skilldistillery.Jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jets;

	public AirField() {
	}

	public List<Jet> getJets() {
		this.jets = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] jetRead = line.split(",");
				String type = jetRead[0];
				String model = jetRead[1];
				double speed = Double.parseDouble(jetRead[2]);
				int range = Integer.parseInt(jetRead[3]);
				long price = Long.parseLong(jetRead[4]);
				Jet newJet = new JetImpl(type, model, speed, range, price);
				jets.add(newJet);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return jets;
	}
}
