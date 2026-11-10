import java.util.Scanner;

public class IT26102528Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            int value = input.nextInt();

            System.out.print(value + " ");

            number++;
        }
    }
}