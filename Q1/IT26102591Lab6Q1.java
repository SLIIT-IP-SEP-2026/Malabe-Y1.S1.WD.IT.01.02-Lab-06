import java.util.Scanner;

public class IT26102591Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;
        double square;
        double squareRoot;

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        square = number * number;
        squareRoot = Math.sqrt(number);

        System.out.println("Square = " + square);
        System.out.println("Square Root = " + squareRoot);
    }
}