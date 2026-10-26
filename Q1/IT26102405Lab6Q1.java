import java.util.Scanner;
public class IT26102405Lab6Q1 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int userInput;
	double squareNum, squareRootNum;
	
	
	System.out.print("Enter a number: ");
	userInput = input.nextInt();
	
	if (userInput <= 0) {
		System.out.println("The number should be greater than 0");
		return;
		
	}
	
	squareNum = (double)userInput * (double)userInput;
	squareRootNum = Math.sqrt((double)userInput);
	
	System.out.println();
	System.out.println("The square of " + (double)userInput + " is : " + squareNum);
	System.out.println("The square root of " + (double)userInput + " is : " + squareRootNum);
	
	
	}
}