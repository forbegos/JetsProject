package com.skilldistillery.Jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jets;
	}

	public void listFleet() {
		int number = 1;
		System.out.println("The current fleet is composed of the following jets: \n");

		for (Jet jet : jets) {
			System.out.println("Jet #" + number + ":");
			System.out.println("Model: " + jet.getModel());
			System.out.println("Speed : " + jet.getSpeed() + " MPH");
			System.out.println("Range: " + jet.getRange() + " Miles");
			System.out.println("Price: USD " + jet.getPrice());
			System.out.println();
			number += 1;
		}
	}

	public void fastestJet() {
		Jet fastest = new JetImpl();
		double speed = 0;
		for (Jet jet : jets) {
			if (jet.getSpeed() > speed) {
				speed = jet.getSpeed();
				fastest = new JetImpl(jet.getType(), jet.getModel(), jet.getSpeed(), jet.getRange(), jet.getPrice());
			}
		}

		System.out.println("The fastest jet in the fleet is:\n ");
		System.out.println(fastest.toString());

	}

	public void longestRange() {
		Jet longest = new JetImpl();
		int range = 0;
		for (Jet jet : jets) {
			if (jet.getRange() > range) {
				range = jet.getRange();
				longest = new JetImpl(jet.getType(), jet.getModel(), jet.getSpeed(), jet.getRange(), jet.getPrice());
			}
		}
		System.out.println("The jet with the longest range in the fleet is: \n");
		System.out.println(longest.toString());
	}

	public void addJet(Scanner kb) {
		Jet newJet = new JetImpl();
		boolean endInput = false;
		System.out.println("Please add the following characteristics of the Jet you wish to add: \n");
		do {
			System.out.print("Please select the type (1 = Fighter Jet), (2 = Cargo Jet) > ");
			String input = kb.next();
			switch (input) {
			case "1":
				System.out.println("Fighter Jet selected.\n");
				newJet.setType("fighter");
				endInput = true;
				break;
			case "2":
				System.out.println("Cargo Jet selected.\n");
				newJet.setType("cargo");
				endInput = true;
				break;
			default:
				System.out.println("Please select the correct type!");
				break;
			}
		} while (!endInput);
		try {
			System.out.print("Please enter model: ");
			newJet.setModel(kb.next());
			System.out.print("Please enter range in miles: ");
			newJet.setRange(kb.nextInt());
			System.out.print("Please enter speed in miles per hour: ");
			newJet.setSpeed(kb.nextDouble());
			System.out.print("Please enter price in USD: ");
			newJet.setPrice(kb.nextLong());
		} catch (Exception e) {
		}

		jets.add(newJet);
		System.out.println("\n Your Jet has been added to the fleet!");
	}
}
