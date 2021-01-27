package com.qa.garage;

public class Tractor extends Vehicle {
	String powerLevel;
	boolean hadPoweredAttachment;

	public Tractor(int id, int noOfWeels, String size, String colour, int maxSpeed, String powerLevel,
			boolean hadPoweredAttachment) {
		super(id, noOfWeels, size, colour, maxSpeed);
		this.powerLevel = powerLevel;
		this.hadPoweredAttachment = hadPoweredAttachment;
	}

	@Override
	public String toString() {
		return "Tractor [id=" + id + " powerLevel=" + powerLevel + ", hadPoweredAttachment=" + hadPoweredAttachment + ", noOfWeels="
				+ noOfWeels + ", size=" + size + ", colour=" + colour + ", maxSpeed=" + maxSpeed + "]";
	}

}
