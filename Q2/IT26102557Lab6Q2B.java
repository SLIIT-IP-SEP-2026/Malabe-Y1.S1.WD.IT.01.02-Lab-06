import java.util.Scanner;

public class IT26102557Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int i = 1;
        String numbers = ""; 

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

           
            numbers = numbers + number + " ";

            i = i + 1;
        }

       
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
    }
}