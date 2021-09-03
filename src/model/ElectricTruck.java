package model;

/**
 * @author Jamison Bice - jdbice
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class ElectricTruck {
	private int range;
	private int payload;
	private String weightClass;
	
	/**
	 * 
	 */
	public ElectricTruck() {
		super();
	}
	
	/**
	 * @param range
	 * @param payload
	 * @param weightClass
	 */
	public ElectricTruck(int range, int payload, String weightClass) {
		super();
		this.range = range;
		this.payload = payload;
		this.weightClass = weightClass;
	}
	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}
	/**
	 * @return the payload
	 */
	public int getPayload() {
		return payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(int payload) {
		this.payload = payload;
	}
	/**
	 * @return the weightClass
	 */
	public String getWeightClass() {
		return weightClass;
	}
	/**
	 * @param weightClass the weightClass to set
	 */
	public void setWeightClass(String weightClass) {
		this.weightClass = weightClass;
	}
	@Override
	public String toString() {
		return "ElectricTruck [range=" + range + ", payload=" + payload + ", weightClass=" + weightClass + "]";
	}
	
	public String makeNoise() {
		return "BRRRZZZZZZZRT!!!! BRRRZZZZZZRRT!!!!";
	}
	
	
	
	
	

}
