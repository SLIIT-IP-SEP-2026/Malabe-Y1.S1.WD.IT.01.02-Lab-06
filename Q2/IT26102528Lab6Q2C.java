import java.util.Scanner;

public class IT26102528Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            int value = input.nextInt();

            sum = sum + value;

            number++;
        }

        double average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}