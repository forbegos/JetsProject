package com.skilldistillery.Jet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
		String input;
		System.out.println("Please add the following characteristics of the Jet you wish to add: \n");
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Please select the type (1 = Fighter Jet), (2 = Cargo Jet) > ");
			input = kb.next();
			if (input.equals("1")) {
				System.out.println("Fighter Jet selected.\n");
				newJet.setType("fighter");
				validInput = true;
				break;
			}
			if (input.equals("2")) {
				System.out.println("Cargo Jet selected.\n");
				newJet.setType("cargo");
				validInput = true;
				break;
			} else {
				System.out.println("Please enter a valid input.");
			}
		}

		System.out.print("Please enter model: ");
		newJet.setModel(kb.next());

		validInput = false;
		int i;
		while (!validInput) {
			System.out.print("Please enter range in miles: ");
			try {
				i = kb.nextInt();
				newJet.setRange(i);
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter correct input in miles");
				kb.nextLine();
			}
		}

		validInput = false;
		double d;
		while (!validInput) {
			System.out.print("Please enter speed in miles per hour: ");
			try {
				d = kb.nextDouble();
				newJet.setSpeed(d);
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter correct input in miles per hour");
				kb.nextLine();
			}
		}

		validInput = false;
		long l;
		while (!validInput) {
			System.out.print("Please enter price in USD: ");
			try {
				l = kb.nextLong();
				newJet.setPrice(l);
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter correct input in USD");
				kb.nextLine();
			}
		}
		jets.add(newJet);
		System.out.println("\n Your Jet has been added to the fleet!");
	}

	public void removeJet(Scanner kb) {
		System.out.print("Please enter the number of the Jet you wish to remove from the list >");
		String input = kb.next();
		if (Integer.parseInt(input) > jets.size()) {
			System.out.println("No such Jet, please try again");
		} else {
			System.out.println("The following Jet has been removed from the fleet: ");
			System.out.println(jets.remove(Integer.parseInt(input) - 1));
		}
	}
}
