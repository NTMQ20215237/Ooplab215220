package week1;
import java.util.Scanner;

public class LinearEquationTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a11, a12, a21, a22, b1, b2;
        System.out.println("Enter a11, a12, b1 in the equations a11x1 + a12x2 = b1 ");
        
            System.out.print("a11 = ");
            a11 = sc.nextDouble();
            System.out.print("a12 = ");
            a12 = sc.nextDouble();
            System.out.print("b1 = ");
            b1 = sc.nextDouble();
            
        System.out.println("Enter a21, a22, b2 in the equations a22x1 + a21x2 = b2 ");
        
            System.out.print("a21 = ");
            a21 = sc.nextDouble();
            System.out.print("a22 = ");
            a22 = sc.nextDouble();
            System.out.print("b2 = ");
            b2 = sc.nextDouble();
        
        double D = a11 * a22 - a21 * a12;
        double D1 = a22 * b1 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D == 0) 
        {
            if (D1+D2!=0)
            System.out.println("The equation system has no root!");
            else System.out.println("The equation system has infinitely many roots");
        }
        else System.out.println("The root of the linear system: x1 = " + D1 / D + ", x2 = " + D2 / D);
       
        sc.close();
    }
}