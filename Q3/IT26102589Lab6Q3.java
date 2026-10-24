import java.util.Scanner;

public class IT26102589Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int n = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (num != -99) {
            if (num < 0) {
                System.out.println("Invalid input:Enter a positive number");
            } else {
                sum = sum + (num * num);
                n = n + 1;
            }
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if (n > 0) {
            double rms = Math.sqrt((double) sum / n);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }

    }
}