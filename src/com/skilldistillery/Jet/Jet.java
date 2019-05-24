package com.skilldistillery.Jet;

public abstract class Jet {
	private String model;
	private String type;
	private double speed;
	private int range;
	private long price;

	public Jet(String model,String type, double speed, int range, long price) {
		this.model = model;
		this.type = type;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public  void fly() {
		
	}

	public  double getSpeedInMach(double speed) {
		double speedInMach = 0.0;
		int speedOfSound = 767;
		speedInMach = speed / speedOfSound;
		return speedInMach;
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
	
	
	
}
