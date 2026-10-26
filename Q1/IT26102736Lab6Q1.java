import java.util.Scanner;
public class IT26102736Lab6Q1{
	public static void main (String[] args) {
		
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//get a number input
		System.out.print("Enter a Number: ");
		double number = input.nextDouble();
		
		//validating the numbers
		if (number > 0){
			
			//Calculating and displaying the square of the numnber
			double sqr = number*number;
			System.out.println("\nThe square of " + number + " is : " + sqr);
			
			//culculating and displaying the square-root of the number
			double sqrt = Math.sqrt(number);
			System.out.println("The square root of " + number + " is : " + String.format("%.2f",sqrt));	
		}
		else {
			System.out.println("Invalid number!");
		}
		
	}
}