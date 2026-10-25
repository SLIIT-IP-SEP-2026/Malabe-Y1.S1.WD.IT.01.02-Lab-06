import java.util.Scanner;
public class IT26102533Lab6Q2B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 numbers : ");
		System.out.print("Enter number 1 : ");
		int n1 = input.nextInt();
		System.out.print("Enter number 2 : ");
		int n2 = input.nextInt();
		System.out.print("Enter number 3 : ");
		int n3 = input.nextInt();
		System.out.print("Enter number 4 : ");
		int n4 = input.nextInt();
		System.out.print("Enter number 5 : ");
		int n5 = input.nextInt();
		System.out.print("Enter number 6 : ");
		int n6 = input.nextInt();
		System.out.print("Enter number 7 : ");
		int n7 = input.nextInt();
		System.out.print("Enter number 8 : ");
		int n8 = input.nextInt();
		System.out.print("Enter number 9 : ");
		int n9 = input.nextInt();
		System.out.print("Enter number 10 : ");
		int n10 = input.nextInt();
		System.out.println();
		System.out.println("The numbers you enterd are : ");
		System.out.print(n1 + " " +n2 + " " +n3 + " " +n4 + " " +n5 + " " +n6 + " " +n7 + " " +n8 + " " +n9+ " " +n10 + " ");
		
		int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		double avg = sum / 10.0;
		
		System.out.print("Sum of the numbers enterd are : "+sum);
		System.out.print("Average of the numbers : "+avg);
		
		
	}
}