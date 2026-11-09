import java.util.Scanner;

public class IT26102557Lab6Q2C{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int i = 1;
        String numbers = ""; 
		int sum=0;


        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

			sum = sum+number;
           
            numbers = numbers + number + " ";

            i = i + 1;
        }
		
		double average = sum/10.0;
       
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
		
		System.out.println("Sum of the numbers are: "+sum);
		System.out.println("Average of the numbers: "+average);
		
		
		
    }
}