import java.util.Scanner;
public class IT26102737Lab6Q1
{
	public static void main(String[] args)
	{
		double number,square,squareRoot;
		
		Scanner output = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		number = output.nextDouble();
		
		if (number <= 0){
		System.out.println("Error: The number must be greater than zero");
		}
		else {
			square = number * number;
			
			squareRoot = Math.sqrt(number);
			
			System.out.println();
			System.out.println("The sqrt of " + number + " is " + square);
			System.out.println("The squareRoot of " + number + " is " + squareRoot);
		}	
	}
}	