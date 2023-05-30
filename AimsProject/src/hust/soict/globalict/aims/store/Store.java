package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBER_IN_STORE=20;
	private int qtyInStore;
	private DigitalVideoDisc itemInStore[]=
	       new DigitalVideoDisc[MAX_NUMBER_IN_STORE];
	public Store() {
		this.qtyInStore = 0;
	}

	public int getQtyInStore() {
		return qtyInStore;
	}

	public void setQtyInStore(int qtyInStore) {
		this.qtyInStore = qtyInStore;
	}
	public boolean duplicated_Title(DigitalVideoDisc disc) {
		for(int i=0;i<qtyInStore;i++)
		{
			if(disc.getTitle().equals(itemInStore[i].getTitle())) {
				return true;
			}
		}
		return false;
	}
	public void addDVD(DigitalVideoDisc disc) {
	     if(qtyInStore==MAX_NUMBER_IN_STORE) {
	    	 System.out.println("The store is full");
			
		}else{
			  if(!duplicated_Title(disc)) {
			  itemInStore[qtyInStore]=disc;
			  qtyInStore++;
			  System.out.println("The dvd number "+qtyInStore+" has been added to store successfully.!!");
		}
			}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int check=-1;
		if(qtyInStore==0) {
			System.out.println("The store is empty");
		}else {
			if(!(duplicated_Title(disc))) {
				System.out.println("The DVD has not been the store");
			}else {
			
			for(int i=0;i<qtyInStore;i++) {
				if(itemInStore[i].getTitle().equals(disc.getTitle())) {
					check=i;
					break;
				}
			}

			}
		}
		if(check!=-1) {
			qtyInStore--;
			for(int i=check;i<qtyInStore;i++) {
				itemInStore[i]=itemInStore[i+1];
			}
			System.out.println("The dvd has been removed from the store.!!");
		}
	}
	public void display(){
		System.out.println("***************Store*******************");
		System.out.println("Store Items:");
	    if (qtyInStore == 0){
	        System.out.println("Out of Stock!");
	    }
	    else{
	        for (int i = 0; i < qtyInStore; i++){
	            System.out.println(i+1+".DVD - " + itemInStore[i].getTitle() + 
	            		" - " + itemInStore[i].getCategory() +
	            		" - " + itemInStore[i].getDirector() +
	            		" - " + itemInStore[i].getLength() +
	            		": " + itemInStore[i].getCost()+"$" );
	        }
	    }
	    System.out.println( "**************************************");
	}
}
