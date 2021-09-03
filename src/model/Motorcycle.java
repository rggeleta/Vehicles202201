package model;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Motorcycle {
	private int milesDriven;
	private int age;
	private String mainColor;
	public Motorcycle () {
		
	}
	public Motorcycle (int milesDriven, int age, String mainColor) {
		setMilesDriven(milesDriven);
		setAge(age);
		setMainColor(mainColor);
	}
	/**
	 * @return the milesDriven
	 */
	public int getMilesDriven() {
		return milesDriven;
	}
	/**
	 * @param milesDriven the milesDriven to set
	 */
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the mainColor
	 */
	public String getMainColor() {
		return mainColor;
	}
	/**
	 * @param mainColor the mainColor to set
	 */
	public void setMainColor(String mainColor) {
		this.mainColor = mainColor;
	}
	@Override
	public String toString() {
		return "Motorcycle [milesDriven=" + milesDriven + ", age=" + age + ", mainColor=" + mainColor + "]";
	}
	public String makeNoise() {
		return "VROOM VROOM!";
	}
}
