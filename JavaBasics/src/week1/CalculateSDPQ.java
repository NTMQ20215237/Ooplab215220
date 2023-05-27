package week1;
import java.util.Scanner;

public class CalculateSDPQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number:");
        double firstNum, secondNum, sum, diff, product, quotient;
        firstNum = scanner.nextDouble();
        secondNum = scanner.nextDouble();
        sum = firstNum + secondNum;
        diff = firstNum - secondNum;
        product = firstNum * secondNum;
        quotient = firstNum / secondNum;
        System.out.println("the sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
    scanner.close();
}
}