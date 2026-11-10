import java.util.Scanner;

public class IT26102567Lab6Q2C{
	public static void main(String[] args){
	
	//Create new scanner object for user input
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter 10 numbers: ");
	
	int i = 1;
	String result = "";
	int sum = 0; 
	
	//Use a while loop to acccept numbers input by keyboard
	while(i <= 10){
		System.out.println("Enter number: " + i + ":");
		int number = input.nextInt(); 
		
		result = result + number + " ";
		sum = sum + number; 
		i++;
	}
	
	// Calculate the average (casting to double for decimal precision)
        double average = (double) sum / 10;
	
	//Print the output
	System.out.println("The number you entered are: ");
	System.out.println(result.trim());
	System.out.println("Sum of the numbers are: " + sum);
	System.out.println("Average of the numbers are: " + sum);
	
	
	input.close();
	
	}
	
}
	
	
	
	
	
	
