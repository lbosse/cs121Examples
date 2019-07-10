import java.awt.Color;

public class CoffeeMug {
	
	private int volume;
	private int fillLevel;
	private String material;
	private String coffee;
	private Color mugColor;
	
	public CoffeeMug(int volume, String material, String coffee) {
		this.volume = volume;
		this.fillLevel = volume;
		this.material = material;
		this.coffee = coffee;
		this.mugColor = new Color(217, 13, 67);
	}
	
	public void drink(int amount) {
		fillLevel -= amount;
	}
	
	public void refill() {
		fillLevel = volume;
	}
	
	public String getCoffee() {
		return coffee;
	}
	
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public int getFillLevel() {
		return fillLevel;
	}
	
	public boolean equals(CoffeeMug otherMug) {
		if (this.fillLevel == otherMug.getFillLevel() && this.coffee.equals(otherMug.getCoffee())) {
			return true;
		} 
		return false;
	}

	public String toString() {
		return "A " + volume + "oz mug of " + coffee;
	}

}
