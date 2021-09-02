package model;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 2, 2021
 */
public class ElectricCar {
	private int batteryCap;
	private int range;
	private String make;
	private String model;

	public ElectricCar() {
		super();
	}

	public ElectricCar(int batteryCap, int range, String make, String model) {
		this.batteryCap = batteryCap;
		this.range = range;
		this.make = make;
		this.model = model;
	}

	public int getBatteryCap() {
		return batteryCap;
	}

	public int getRange() {
		return range;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public void setBatteryCap(int batteryCap) {
		this.batteryCap = batteryCap;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Electric Car [Make: " + make + ", Model: " + model + ", Battery Cap: " + batteryCap + ", Range: "
				+ range + "]";
	}

	public String makeNoise() {
		return ("Silence...");
	}

}
