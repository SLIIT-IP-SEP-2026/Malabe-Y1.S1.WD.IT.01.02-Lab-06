import java.util.Scanner;

public class IT26102415Lab6Q1{

	public static void main(String[]args){
	double  number,squre,squreRoot;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number :");
	number = input.nextDouble();
	
	if (number <= 0){
		System.out.println("Error:The number must be greater than zero");
	}
	else {
		squre = number*number;
		
		squreRoot =Math.sqrt(number);
		
		System.out.println();
		System.out.println("The square of " + number + " is : " + squre);
		System.out.println("The square root of " + number + " is : " + squreRoot);
	}
	
		
	}
}