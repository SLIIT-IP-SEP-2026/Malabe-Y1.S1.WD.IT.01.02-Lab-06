import java.util.Scanner;

public class IT26102589Lab6Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        System.out.println("Square of " + number + " is: " + square);

        if (number >= 0) {
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } else {
            System.out.println("Square root cannot be found for a negative number.");
        }

      
    }
}