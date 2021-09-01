package model;


/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Aug 31, 2021
 */

public class Truck {
	private String color;
	private int miles;
	private int year;
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int miles, int year) {
		super();
		this.color = color;
		this.miles = miles;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", miles=" + miles + ", year=" + year + "]";
	}
	
	public String makeNoise() {
		return "Honk Honk!";
	}
	
	
	
}
