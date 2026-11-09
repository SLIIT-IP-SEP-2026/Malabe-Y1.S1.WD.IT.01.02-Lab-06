import java.util.Scanner;

public class IT26102606Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, square, squareRoot;

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextDouble();

        // Calculate the square of the number
        square = number * number;

        // Calculate the square root of the number
        squareRoot = Math.sqrt(number);

        // Display the results in the exact required format
        System.out.println();
        System.out.println("The square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);

        input.close();
    }
}