import java.util.Scanner;
public class IT26102460Lab6Q2C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number, count, sum;
		sum = 0;
		String output = "";
		
		System.out.println("Please Enter 10 numbers:");
		
		for(count = 1; count<=10; ++count){
			System.out.print("Enter number " + count + " : ");
			number = input.nextInt();
			sum += number;
			output = output + number + " ";
			}
		System.out.println();
		System.out.println("The numbers you have entered are: ");
		System.out.print(output);
		
		System.out.println();
		System.out.println("Sum of the numbers: " + sum);
		double Average = sum/10;
		System.out.println("Average of the numbers: " + Average);
	}
}