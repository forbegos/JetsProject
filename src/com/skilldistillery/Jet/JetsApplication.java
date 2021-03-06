package com.skilldistillery.Jet;

import java.util.Scanner;

public class JetsApplication {
	private AirField fleet = new AirField();
	private FighterJet jets = new FighterJet();
	private CargoPlane cargos = new CargoPlane();

	public static void main(String[] args) {
		JetsApplication jet = new JetsApplication();
		jet.run();
	}

	public void run() {
		fleet.getJets();
		displayUserMenu();

	}

	private void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("-------------------- WELCOME TO THE AIRFIELD --------------------\n");
		System.out.println("--------------------------- MAIN MENU ------------------------------\n");

		boolean badSelect = false;
		do {
			System.out.println("PLEASE SELECT FROM THE FOLLOWING OPTIONS:                               \n");
			System.out.println("(1) List Fleet");
			System.out.println("(2) Fly all jets");
			System.out.println("(3) View fastest jet");
			System.out.println("(4) View jet with longest range");
			System.out.println("(5) Load all Cargo Jets");
			System.out.println("(6) Dogfight!");
			System.out.println("(7) Add jet to Fleet");
			System.out.println("(8) Remove a jet from Fleet");
			System.out.println("(9) Quit");
			System.out.println("\n Please enter your option > ");
			String option = kb.next();
			switch (option) {
			case "1":
				clearScreen();
				listFleet();
				prompt(kb);
				clearScreen();
				break;
			case "2":
				clearScreen();
				flyAllJets();
				prompt(kb);
				clearScreen();
				break;
			case "3":
				clearScreen();
				listFastestJet();
				prompt(kb);
				clearScreen();
				break;
			case "4":
				clearScreen();
				listLongestRange();
				prompt(kb);
				clearScreen();
				break;
			case "5":
				clearScreen();
				loadCargo();
				prompt(kb);
				clearScreen();
				break;
			case "6":
				clearScreen();
				dogFight();
				prompt(kb);
				clearScreen();
				break;
			case "7":
				clearScreen();
				addJet(kb);
				prompt(kb);
				clearScreen();
				break;
			case "8":
				clearScreen();
				removeJet(kb);
				prompt(kb);
				clearScreen();
				break;
			case "9":
				clearScreen();
				System.out.println("\n\nQuitting now.... \n Goodbye!!");
				badSelect = true;
				break;
			default:
				System.out.println("Wrong option selected, please try again.");
				clearScreen();
				break;
			}
		} while (!badSelect);
		kb.close();
	}

	public void listFleet() {
		fleet.listFleet();
	}

	public void flyAllJets() {
		jets.fly();
		cargos.fly();
	}

	public void listFastestJet() {
		fleet.fastestJet();
	}

	public void clearScreen() {
		System.out.println(new String(new char[80]).replace("\0", "\r\n"));
	}

	public void prompt(Scanner kb) {
		kb.nextLine();
		System.out.print("Press any enter to continue.");
		kb.nextLine();

	}

	public void listLongestRange() {
		fleet.longestRange();
	}

	public void loadCargo() {
		cargos.loadCargo();

	}

	public void dogFight() {
		jets.fight();
	}

	public void addJet(Scanner kb) {
		fleet.addJet(kb);
	}

	public void removeJet(Scanner kb) {
		fleet.removeJet(kb);
	}
}
