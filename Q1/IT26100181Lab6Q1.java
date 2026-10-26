import java.util.Scanner;
public class IT26100181Lab6Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Getting the number....
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		
		// Getting the square of the number....
		int squareNum = num * num;
		
		// Getting the square root of the number...
		double sqRootNum = Math.sqrt(num);
		
		// Displaying the square and the square root of the entered number...
		System.out.println("Square of the entered number is : " + squareNum);
		System.out.println("Square root of the entered number is : " + sqRootNum);
	}
}