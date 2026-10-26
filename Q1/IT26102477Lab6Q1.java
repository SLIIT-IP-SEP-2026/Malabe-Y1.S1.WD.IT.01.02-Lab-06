import java.util.Scanner;
public class IT26102477Lab6Q1 {
    public static void main (String [] args){
	    
	int number;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a integer:");
    number = input.nextInt();
	
	if(number <= 0){
		System.out.print("Error: Enter a number greater than zero");
	}
    else {
    int squareRoot = number * number;
    System.out.println(" The square of your number is: " + squareRoot);

    double rootnumber = Math.sqrt(number);
    System.out.println(" The root of this number is: " + rootnumber);
	
	
	
	}
	}
	}