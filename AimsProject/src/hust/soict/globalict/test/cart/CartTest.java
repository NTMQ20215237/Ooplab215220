package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin","Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		cart.display();
		//Test the searching method by title here
		cart.TitleChecking("Star War");
		cart.TitleChecking("The Snow Queen");
		//Test the searching method by ID here
		cart.IDchecking(3);
		cart.IDchecking(5);
	}
}
