import java.util.Scanner;

public class IT26102415Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int [] numbers = new int[10];

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = input.nextInt();
            i++;
        }

        System.out.print("The numbers you entered are: ");
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

    }
}