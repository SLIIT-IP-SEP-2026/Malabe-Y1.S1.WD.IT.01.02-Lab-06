import java.util.Scanner;
public class IT26102483Lab6Q2C
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int number = 1;
        String allNumbers = "";
        int sum = 0;
		System.out.println("Please enter 10 numbers:");
        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            int n = input.nextInt();
            allNumbers += n + " ";  
            sum += n;                
            number += 1;
        }
		double average = sum / 10.0; 
		System.out.println(" ");
		System.out.println("The numbers you entered are: ");
		System.out.println(allNumbers);
		System.out.println(" ");
		System.out.println("Sum of the numbers : " + sum);
        System.out.println("Average of the numbers : " + average);
	}
}