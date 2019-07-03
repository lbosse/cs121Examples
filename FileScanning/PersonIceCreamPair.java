
public class PersonIceCreamPair {

	private String person;
	private String iceCream;
	
	public PersonIceCreamPair(String person, String iceCream) {
		this.person = person;
		this.iceCream = iceCream;
	}
	
	public String getIceCream() {
		return iceCream;
	}
	
	public void setIceCream(String iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String toString() {
		return person + " likes " + iceCream + " ice cream!";
	}
}
