package model;

/**
 * @author Brady Trenary-bbtrenary
 *CIS175 - Fall 2021
 * Aug 27, 2021
 */
public class Jeep {
	private String model;
	private int year;
	private int numberOfDoors;
	
	public Jeep() {
		super();
	}
	
	public Jeep(String model, int year, int numberOfDoors) {
		super();
		this.model = model;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
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

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Jeep [model=" + model + ", year=" + year + ", numberOfDoors=" + numberOfDoors + "]";
	}
	
	public String makeNoise() {
		return "Vroooom!";
	}
}
