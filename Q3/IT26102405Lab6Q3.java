import java.util.Scanner;
public class IT26102405Lab6Q3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int numSum = 0;
		int numOfInputs = 0;
		
		System.out.println("Enter positive integers (terminate input with -99):");
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		
		while (userInput != -99) {
			if (userInput <= 0) {
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			}
			else {
				numSum = numSum + (userInput * userInput);
				numOfInputs++;
			}
			
			System.out.print("Enter a number: ");
			userInput = input.nextInt();
		}
		
		System.out.println();
		
		double rmsValue = Math.sqrt(numSum/numOfInputs);
		System.out.println("The Root Mean Square (RMS) is: " + rmsValue);
	
	}

}