package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[]=
	        new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	public Cart() {
		this.qtyOrdered = 0;
		}
	public int getQtyOrdered() {
		return this.qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;

	}
public boolean duplicated_Titlechecking(DigitalVideoDisc dvd) {
		for(int i=0;i<qtyOrdered;i++) {
		if (dvd.getTitle().equals(itemOrdered[i].getTitle())) {return true;}
		}
		return false;
	}
public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	if(qtyOrdered == MAX_NUMBER_ORDERED) {
		System.out.println("The cart is full");
	}else {
		itemOrdered[qtyOrdered]= new DigitalVideoDisc(disc.getTitle(),disc.getCategory(),disc.getDirector(),disc.getLength(),disc.getCost());
		qtyOrdered++;
		System.out.println("The disc has been added");
	}
}
public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList)
{ 
	for (int i=0;i<dvdList.length;i++) {
		if (qtyOrdered >= MAX_NUMBER_ORDERED)	{
			System.out.println("The cart is full");break;
		}else {
				if(!duplicated_Titlechecking(dvdList[i])) {
					itemOrdered[qtyOrdered]=dvdList[i];
					qtyOrdered++;
					System.out.println("The disc number "+qtyOrdered+ " has been added");}
		       }
		}
}
public void addDigitalVideoDisc (DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
{
	if(qtyOrdered==MAX_NUMBER_ORDERED-1) {
		System.out.println("The cart is already full");
	}else {
    	if(!duplicated_Titlechecking(dvd1)&&!duplicated_Titlechecking(dvd2)) {
		itemOrdered[qtyOrdered]=dvd1;qtyOrdered++;
	System.out.println("The dvd has been added");
	       itemOrdered[qtyOrdered]=dvd2;qtyOrdered++;
	System.out.println("The dvd has been added");		
	}
	}
}
public void display(){
	System.out.println("***************CART*******************");
	System.out.println("Ordered Items:");
    if (qtyOrdered == 0){
        System.out.println("Out of Stock!");
    }
    else{
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println(itemOrdered[i].getID()+".DVD - " + itemOrdered[i].getTitle() + 
            		" - " + itemOrdered[i].getCategory() +
            		" - " + itemOrdered[i].getDirector() +
            		" - " + itemOrdered[i].getLength() +
            		": " + itemOrdered[i].getCost()+"$" );
        }
    }
    System.out.println("Total cost:"+ totalCost()+"$\n"
    		+ "**************************************");
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	int check=-1;
	if(qtyOrdered==0)
	{
		System.out.println("No Stock! ");
	}
	else {
		for(int i=0;i<qtyOrdered;i++)
		{
		if(itemOrdered[i].getTitle().equals(disc.getTitle()))
		{
		check =i;
		break;
		}
		}
	if(check==-1)
	{
		System.out.println("Item could not be detected");
	}
	else {
		for(int i=check;i<qtyOrdered -1;i++)
		{
			itemOrdered[i]= new DigitalVideoDisc(itemOrdered[i+1].getTitle(),itemOrdered[i+1].getCategory(),itemOrdered[i+1].getDirector(),itemOrdered[i+1].getLength(),itemOrdered[i+1].getCost());
		}
		qtyOrdered--;
	  }
	}
  }
public float totalCost() {
	float total=5.5f;
	for (int i=0;i<qtyOrdered;i++)
	{ 
		total+=itemOrdered[i].getCost();
	}
return total;
}
public void IDchecking (int id) {
	int max=0;
	for(int i = 0;i<qtyOrdered;i++) {
		if(itemOrdered[i].getID()==id) {
			System.out.println(itemOrdered[i].getID()+".DVD - " + itemOrdered[i].getTitle() + 
            		" - " + itemOrdered[i].getCategory() +
            		" - " + itemOrdered[i].getDirector() +
            		" - " + itemOrdered[i].getLength() +
            		": " + itemOrdered[i].getCost()+"$" );break;
		}else {max++;}
	}
	if(max==qtyOrdered) {System.out.println("The title is invalid.!");}
	}
public void TitleChecking(String title) {
	int max=0;
	for(int i = 0;i<qtyOrdered;i++) {
		if(itemOrdered[i].getTitle().equals(title)) {
			System.out.println(itemOrdered[i].getID()+".DVD - " + itemOrdered[i].getTitle() + 
            		" - " + itemOrdered[i].getCategory() +
            		" - " + itemOrdered[i].getDirector() +
            		" - " + itemOrdered[i].getLength() +
            		": " + itemOrdered[i].getCost()+"$" );break;
		}else {max++;}
		
		
	}
	if(max==qtyOrdered) {System.out.println("The title is invalid.!");}
}
}

