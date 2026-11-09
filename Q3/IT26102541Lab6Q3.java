import java.util.Scanner;

public class IT26102541Lab6Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while(number != -99)
        {
            if(number < 0)
            {
                System.out.println("Invalid input! Please enter a positive integer or -99 to terminate");
            }
            else
            {
                sumSquares = sumSquares + (number * number);
                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        rms = Math.sqrt(sumSquares / count);

        System.out.println("\nThe Root Mean Square (RMS) is: " + rms);

        
    }
}