import java.util.Scanner;
public class IT26102098Lab6Q1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		if (number <= 0) {
			System.out.println("Error: The number must be greater than zero");
		}
		else {
			double square = number * number;
			
			double squareRoot = Math.sqrt(number);
			
			System.out.println();
			System.out.println("The square of " + number + " is : " + square);
			System.out.println("The square root of " + number + " is : " + squareRoot);
			System.out.println("The square root of " + number + " is : " + String.format("%.2f",squareRoot));
		}
	}
} 