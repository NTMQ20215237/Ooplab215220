package week1;
import java.util.Scanner;
public class Month {
	public static int get (String month)
	{
   	 String type1[]= {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
   	 String type2[]= {"january","febuary","march","april","may","june","july","august","september","october","november","december"};
     String type3[] = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
     String type4[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
     String type5[] = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
     String type6[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};	
    int a=1;
    for (int i=0;i<12;i++)
	{
    	if (month.equals(type1[i])||month.equals(type2[i])||month.equals(type3[i])||month.equals(type4[i])||month.equals(type5[i])||month.equals(type6[i])){
    		
        {
         a=i+1;
   	     break;
        }	
	}
	}
	return a;
    }
public static void main (String []args)
{
Scanner keyboard= new Scanner(System.in);
int year;
String month;
do
{
		System.out.println("Enter a month (full name, abbreviation, 3 letters or number, for instance: January or Jan or 1):");
        month = keyboard.next();
 		System.out.println("Enter a year ");
        year = keyboard.nextInt();
	} 
while (year<=0||(year + "").length()<=2||(year+"").length()>4);
int check;
if (((year%4==0)&&(year%100!=0)) || (year%400 == 0)) check =1;
else check =0;
int i = get(month);
switch(i){
    case 2:
        if (check == 1) System.out.println(29);
        else System.out.println(28);
        break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        System.out.println(31);
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println(30);
        break;
 }
 keyboard.close();    
}
}
