import java.util.Scanner;
public class IT26102362Lab6Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double number, square, squareRoot;
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		if (number<0){
			System.out.println("Enter a positive number");
		}
		else{
			square = number*number;
			squareRoot= Math.sqrt(number);
		
			System.out.println("\nThe square of "+ number +"is: "+square);
			System.out.println("The square root of "+ number +"is: "+String.format("%.2f",squareRoot));
		}
	}
}