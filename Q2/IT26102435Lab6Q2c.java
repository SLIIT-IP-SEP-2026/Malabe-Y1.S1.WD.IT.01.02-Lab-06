import java.util.Scanner;

public class IT26102435Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = "";
        int sum = 0;
        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            numbers = numbers + num + " ";
            sum = sum + num;
            i++;
        }

        double average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}