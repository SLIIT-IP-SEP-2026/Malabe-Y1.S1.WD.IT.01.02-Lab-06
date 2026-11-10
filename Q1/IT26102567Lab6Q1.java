import java.util.Scanner;

public class IT26102567Lab6Q1{
	public static void main(String[] args){
		
		//Create scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user to input a number
		System.out.print("Enter a number: ");
		double number = Scanner.nextDouble();
		
		//Calculate the the square and square root of the number
		double square = number * number; 
		double squareRoot = Math.sqrt(number);
		
		//Display the results in the suitable output format
		System.out.println("The square of" + number + "is: " + square);
		System.out.println("The square root of" + number + "is: " + squareRoot); 
		
		input.close(); 
		
	}
	
}