import java.util.Scanner;
public class IT26102477Lab6Q3 {
    public static void main (String [] args){
		int number;
		double meanOfSquares , rms;
		
		double sumOfSquare = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99): ");
		
	while (true)  {
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number == -99) {
		break;
		}
		else if (number < 0) {
			System.out.println("Invalid input. please enter a positive integers: ");
			continue;
			
		} else {
			sumOfSquare += Math.pow(number, 2); 
			count++;
		}
	
	if (count > 0) {
		
		meanOfSquares = sumOfSquare / count;
		rms = Math.sqrt(meanOfSquares);
		
		System.out.println();
		System.out.println("The Root Mean Square (RMS) is: " + rms);
		
	}
	else {
		System.out.println("No positive numbers were entered");
	}   
	 
	}
	}
}