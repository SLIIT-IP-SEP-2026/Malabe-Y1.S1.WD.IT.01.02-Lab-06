import java.util.Scanner;

public class IT26102591Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count;

        count = 0;

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = input.nextInt();

            count++;
        }

        System.out.println("The numbers are:");

        count = 0;

        while (count < 10) {
            System.out.print(numbers[count] + " ");

            count++;
        }
    }
}