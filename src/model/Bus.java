package model;
/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Aug 27, 2021
 */


public class Bus {
	private String model;
	private int year;
	private int numberOfWindows;
	private int numberOfOccupents;
	
	public Bus() {
		super();
		
	}
	
	public Bus(String model, int year, int numberOfWindows, int numberOfOccipents ) {
		super();
		this.model = model;
		this.year = year;
		this.numberOfWindows = numberOfWindows;
		this.numberOfOccupents = numberOfOccipents;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	public int getNumberOfOccupents() {
		return numberOfOccupents;
	}

	public void setNumberOfOccupents(int numberOfOccupents) {
		this.numberOfOccupents = numberOfOccupents;
	}

	@Override
	public String toString() {
		return "Bus [model=" + model + ", year=" + year + ", numberOfWindows=" + numberOfWindows
				+ ", numberOfOccupents=" + numberOfOccupents + "]";
	}
	
	public String makeNoise() {
		return "pfsssst!";
	}
}
