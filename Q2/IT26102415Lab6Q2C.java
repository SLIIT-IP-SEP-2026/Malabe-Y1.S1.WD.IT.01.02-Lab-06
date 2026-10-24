
import java.util.Scanner;

public class IT26102415Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            i++;
        }

        System.out.print("The numbers you entered are: ");
        i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        
    }
}