import java.util.Scanner;

public class IT26102636Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        String numbersStr = "";
        
        System.out.println("Please enter 10 numbers:");
        while (i < 10) {
            System.out.println("Enter number " + (i + 1) + ":");
            int num = input.nextInt();
            sum += num;
            numbersStr += num + " ";
            i++;
        }
        
        System.out.println("The numbers you entered are:");
        System.out.println(numbersStr.trim());
        
        double average = (double) sum / 10;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
    }
}