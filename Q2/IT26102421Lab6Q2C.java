import java.util.Scanner;

public class IT26102421Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int enterednumber;
        String numbers = "";
		int sum = 0;

        System.out.println("Please enter 10 numbers:");

        while (i < 11) {
            System.out.print("Enter number " + i + ": ");
            enterednumber = input.nextInt();

            numbers = numbers + enterednumber + " ";
            i++;
			
			sum = sum + enterednumber;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);
		
		double average = sum/10;
		
		System.out.println("The sum of the numbers are: "+ sum);
		System.out.print("The average of the numbers are: "+ average);

        input.close();
    }
}
 
 