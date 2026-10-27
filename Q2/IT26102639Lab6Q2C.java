import java.util.Scanner;

public class IT26102639Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;
        int numbers[] = new int[10];
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {

            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            numbers[count - 1] = number;

            sum = sum + number;

            count++;
        }

        average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");

        count = 1;

        while (count <= 10) {

            System.out.print(numbers[count - 1] + " ");

            count++;
        }

        System.out.println();
        System.out.println();
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);

    }

}