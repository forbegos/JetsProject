package com.skilldistillery.Jet;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String type, String model, double speed, int range, long price) {
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet model: ");
		builder.append(model + "\n");
		builder.append("Speed: ");
		builder.append(speed + " MPH\n");
		builder.append("Range: ");
		builder.append(range + " Miles\n");
		builder.append("Price: USD ");
		builder.append(price + "\n");
		return builder.toString();
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void fly() {
		AirField fleet = new AirField();
		System.out.println("All jets are now flying!...: \n");
		for (Jet jet : fleet.getJets()) {
			System.out.println("Model: " + jet.getModel());
			System.out.println("Speed : " + jet.getSpeed() + " MPH");
			System.out.println("Range: " + jet.getRange() + " Miles");
			System.out.println("Price: USD " + jet.getPrice());
			System.out.println();
			System.out.println("Flight time: " + jet.getRange() / jet.getSpeed() + " hours.");
			System.out.println();
		}
	}		
	

	public double getSpeedInMach(double speed) {
		double speedInMach = 0.0;
		int speedOfSound = 767;
		speedInMach = speed / speedOfSound;
		return speedInMach;
	}
}
