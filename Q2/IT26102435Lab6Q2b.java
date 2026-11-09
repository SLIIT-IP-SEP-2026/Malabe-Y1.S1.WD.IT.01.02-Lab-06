import java.util.Scanner;

public class IT26102435Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = "";
        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            numbers = numbers + num + " ";
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
    }
}