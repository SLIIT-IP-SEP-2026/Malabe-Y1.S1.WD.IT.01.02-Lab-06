import java.util.Scanner;
public class IT26102098Lab6Q2C {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String numbers = "";
		int i = 1;
		int num;
		int sum = 0;
		double average;
		
		System.out.println("Please enter 10 numbers: ");
		while ( i <= 10) {
			System.out.print("Enter number " + i + ": ");
			num = input.nextInt();
			numbers += num + " ";
			
			sum = sum + num;
			i++;
		}
		
		average = sum/ 10.00;
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.println(numbers);
		
		System.out.println();
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);
		
	}
}