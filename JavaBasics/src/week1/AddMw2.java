package week1;
import java.util.Scanner;

public class AddMw2 {
	private static Scanner sc;
	public static void main(String[] args) {
		int i, j, rows, columns;
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Please Enter Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		
		System.out.println("\n Please Enter the First Matrics Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr1[i][j] = sc.nextInt();
			}		
		}
		System.out.println("\n Please Enter the Second Matrics Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr2[i][j] = sc.nextInt();
			}		
		}
		System.out.println("\n-----The Sum of two Matrixes----- ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				System.out.format("%d \t", (arr1[i][j] + arr2[i][j]));
			}
			System.out.println("");
		}
	}
}