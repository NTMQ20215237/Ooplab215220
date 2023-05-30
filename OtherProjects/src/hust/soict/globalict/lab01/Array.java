package hust.soict.globalict.lab01;
import java.util.Arrays;
//import java.util.Scanner;
public class Array {
	public static void main(String[] args )
	{
		// System.out.println("Nhập vào số phần tử trong mảng: ");     
		//Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		int sum=0;
		int [] my_array1= {1789,2035,1899,1456,2013};//The array can be entered by the user or a constant.
		System.out.println("Mang goc la:"+Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Mang sau khi sap xep la:"+Arrays.toString(my_array1));
		for (int i=0;i<my_array1.length;i++)
		{
		sum= sum+ my_array1[i];
		}
	 double average;
	average=sum/5.0;
	System.out.println("Gia tri trung binh cua mang la :"+average);
	System.out.println("Tong cua mang la:"+sum);
	}

}
