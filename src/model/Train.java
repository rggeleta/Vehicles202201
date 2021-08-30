package model;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 */
public class Train {
	private String Color;
	private int Miles;
	private int Age;
	
	//Constructors
	
	public Train() {
		super();
	}
	
	public Train(String Color, int Miles, int Age) {
		super();
		this.Age = Age;
		this.Color = Color;
		this.Miles = Miles;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}
	/**
	 * @return the miles
	 */
	public int getMiles() {
		return Miles;
	}
	/**
	 * @param miles the miles to set
	 */
	public void setMiles(int miles) {
		Miles = miles;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}
	
	public String makeNoise() {
		return "Choo-Choo";
	}

}
