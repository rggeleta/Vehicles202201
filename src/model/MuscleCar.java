package model;

/**
 * @author Wade Shafer-wrshafer3
 *CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class MuscleCar {
	private String color;
	private int year;
	private int horsePower;
	
	public MuscleCar() {
		super();
	}

	public MuscleCar(String color, int year, int horsePower) {
		super();
		this.color = color;
		this.year = year;
		this.horsePower = horsePower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "MuscleCar [color=" + color + ", year=" + year + ", horsePower=" + horsePower + "]";
	}
	
	public String makeNoise() {
		return "Rumble-Rumble";
	}
	
}
