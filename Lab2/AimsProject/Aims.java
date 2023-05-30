<<<<<<< HEAD
package Aimsproject;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("TheLionKing",
				"Animation", "Roger Allers",87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.display();
		
		//print total cost of the items in the cart
		System.out.println("Total Cost is:");
		System.out.println(anOrder.toatalCost());
		//remove items in the cart
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("The item \"dvd1\" has just been removed from the cart.!");
        anOrder.display();
	}

}
=======
package Aimsproject;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("TheLionKing",
				"Animation", "Roger Allers",87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.display();
		
		//print total cost of the items in the cart
		System.out.println("Total Cost is:");
		System.out.println(anOrder.toatalCost());
		//remove items in the cart
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("The item \"dvd1\" has just been removed from the cart.!");
        anOrder.display();
	}

}
>>>>>>> 15efee3b0ebf579e1244b8d5ca33a429ed821977
