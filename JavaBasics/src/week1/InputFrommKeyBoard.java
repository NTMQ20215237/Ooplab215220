package week1;
import java.util.Scanner;
public class InputFrommKeyBoard {
public static void main (String arg[]) {
	Scanner keyboard= new Scanner(System.in);
	System.out.println("Whats your name?");
	String strName=keyboard.nextLine();
	System.out.println("How old are you?" );
	int iAge= keyboard.nextInt();
	System.out.println("How tall are you?");
	double dHeight=keyboard.nextDouble();
System.out.println("Mrs/Ms " + strName +", "+ iAge +" years old." + " Your height is " + dHeight + ".");	

}
}

