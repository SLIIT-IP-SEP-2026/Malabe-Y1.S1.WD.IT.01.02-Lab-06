import java.util.Scanner;

public class IT26102557Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;              
        double sumSquares = 0.0;    

        System.out.println("Enter positive integers (terminate input with -99):");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number != -99) {
            if (number < 0) {
              
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                
                sumSquares = sumSquares + (number * number);
                count = count + 1;
            }
 
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }
        double rms = 0.0;
        if (count > 0) {
            rms = Math.sqrt(sumSquares / count);
        }
        System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
    }
}