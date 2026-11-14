import java.util.Scanner;
public class IT26102483Lab6Q1
{
	public static void main(String[]args)
	{
		double number,square,squareRoot;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a number:");
		number=input.nextDouble();
		if (number <= 0){
			square=number*number;
			System.out.println("The square of "+number+"is :"+square);
			System.out.println("Error");
		}
		else{
			square=number*number;
			System.out.println("The square of "+number+"is :"+square);
			squareRoot=Math.sqrt(number);
			System.out.printf("The square root of "+number+"is :"+ "%.2f",squareRoot);
		}
	}	
}		