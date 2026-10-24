import java.util.Scanner;

public class IT26102589Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            sum = sum + number;
            i++;
        }

        double average = sum / 10.0;

        System.out.println("Sum of the 10 numbers is: " + sum);
        System.out.println("Average of the 10 numbers is: " + average);

      
    }
}