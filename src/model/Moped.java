package model;

public class Moped {
	
	private int coolFactor;
	private String color;
	private boolean storageTrunk;
	
	public Moped() {
		super();
	}
	public Moped(int coolFactor, String color, boolean storageTrunk) {
		super();
		this.coolFactor = coolFactor;
		this.color = color;
		this.storageTrunk = storageTrunk;
	}
	
	public int getCoolFactor() {
		return coolFactor;
	}
	public void setCoolFactor(int coolFactor) {
		this.coolFactor = coolFactor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isStorageTrunk() {
		return storageTrunk;
	}
	public void setStorageTrunk(boolean storageTrunk) {
		this.storageTrunk = storageTrunk;
	}
	
	@Override
	public String toString() {
		return "Moped [coolFactor=" + coolFactor + ", color=" + color + ", storageTrunk=" + storageTrunk + "]";
	}
	public String makeNoise() {
		return "beep beep";
	}

}
