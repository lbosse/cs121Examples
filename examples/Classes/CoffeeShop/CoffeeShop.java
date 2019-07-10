
public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeMug myMug = new CoffeeMug(24, "Cardboard", "Jacksons Nitro Blend");
		System.out.println(myMug);
		
		CoffeeMug taylorsMug = new CoffeeMug(16, "Yeti", "Starbucks Veranda Blend");
		System.out.println(taylorsMug);
		
		CoffeeMug secondCup = new CoffeeMug(24, "Cardboard", "Jacksons Nitro Blend");
	
		System.out.println(myMug.equals(taylorsMug));
		System.out.println(secondCup.equals(myMug));
		
	}

}
