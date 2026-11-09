import java.util.Scanner;

public class IT26102541Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
		
		System.out.println("Please enter 10 numbers:");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            number = input.nextInt();

            sum += number;
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}