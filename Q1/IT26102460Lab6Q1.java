import java.util.Scanner;
public class IT26102460Lab6Q1{
	public static void main(String[] args){
		double Number, squareNumber, rootNumber;
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		Number = input.nextDouble();
		
		squareNumber = Number * Number;
		System.out.println("The square of " + Number + " is " + squareNumber);
		
		rootNumber = Math.sqrt(Number);
		System.out.println("The square root of " + Number + " is " + rootNumber);
	}
}