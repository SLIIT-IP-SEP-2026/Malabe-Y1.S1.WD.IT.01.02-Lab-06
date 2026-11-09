import java.util.Scanner;
public class IT26102541Lab6Q1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double number , square , squareRoot;
		
		System.out.println("Enter a number: ");
		number = input.nextDouble();
		
		square = number*number;
		squareRoot = Math.sqrt(number);
		
		System.out.println("Square of " + number + " : " + square);
		System.out.println("Squareroot of " + number + " : " + squareRoot);
		
	}
}