package Aimsproject;

public class ex {
public static final int MAX_NUMBER_ORDERED = 20;
private DigitalVideoDisc itemOrdered[]=
        new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered;
public ex() {
	this.qtyOrdered = 0;
	}
public int getQtyOrdered() {
	return this.qtyOrdered;
}
public void setQtyOrdered(int qtyOrdered) {
	this.qtyOrdered = qtyOrdered;

}
public void addDigitalVideoDisc(DigitalVideoDisc disc){
    if (qtyOrdered == MAX_NUMBER_ORDERED){
        System.out.println("The cart is full");
    }else{
        itemOrdered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), 
                                            disc.getDirector(), disc.getLength(), disc.getCost());
        qtyOrdered++;
        System.out.println("The disc has been added");
    }
}
public void display(){
    if (qtyOrdered == 0){
        System.out.println("Out of Stock!");
    }
    else{
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println("Name: " + itemOrdered[i].getTitle() + 
            		"; Category: " + itemOrdered[i].getCategory() +
            		"; Director: " + itemOrdered[i].getDirector() +
            		"; Length: " + itemOrdered[i].getLength() +
            		"; Cost: " + itemOrdered[i].getCost());
        }
    }
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    int check = -1;
    if (qtyOrdered == 0){
        System.out.println("Out of stock !");
    }
    else{
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].getTitle().equals(disc.getTitle())
                ){
                check = i;
                break;
            }

        }
        if (check == -1){
            System.out.println("Cannot detect the item");
        }
        else{
            for (int i = check; i < qtyOrdered - 1; i++){
                itemOrdered[i] = new DigitalVideoDisc(itemOrdered[i + 1].getTitle(), itemOrdered[i + 1].getCategory(), 
                                                      itemOrdered[i + 1].getDirector(), itemOrdered[i + 1].getLength(), 
                                                      itemOrdered[i + 1].getCost());
            }
            qtyOrdered--;
        }
    }
}
public float totalCost(){
    float total = 0.0f;
    for (int i = 0; i < qtyOrdered; i++){
        total += itemOrdered[i].getCost();
    }
    
    return total;}

}
