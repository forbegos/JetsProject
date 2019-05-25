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
		builder.append("Jet [type=");
		builder.append(type);
		builder.append(", model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
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
	}

	public double getSpeedInMach(double speed) {
		double speedInMach = 0.0;
		int speedOfSound = 767;
		speedInMach = speed / speedOfSound;
		return speedInMach;
	}
}
