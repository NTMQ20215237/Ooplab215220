package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
public class StoreTest {


		public static void main(String[] args) {
			//Create new store
	    Store store =new Store();
	       //Create new items
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers",87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		//Add new item to store
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		store.addDVD(dvd1);
		//Show the store
		store.display();
		//Remove item from the store
		store.removeDVD(dvd3);
		//Show the store again
		store.display();
		}

	}

