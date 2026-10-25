import java.util.Scanner;

public class IT26102421Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int enterednumber;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (i < 11) {
            System.out.print("Enter number " + i + ": ");
            enterednumber = input.nextInt();

            numbers = numbers + enterednumber + " ";
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);

        input.close();
    }
}