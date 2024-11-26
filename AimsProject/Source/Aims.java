
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		//Total
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("StarWars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		//print total cost of the items in the cart
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		//Remove
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("The Lion King is removed from lists");
		System.out.println("Total cost after remove dvd1 is " + anOrder.totalCost());
	}
}
