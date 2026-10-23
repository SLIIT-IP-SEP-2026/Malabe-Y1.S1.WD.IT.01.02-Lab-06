import java.util.Scanner;
 public class IT26102597Lab6Q3 {
	 public static void main (String [] args){
		 
		 //Create an object call input to Scanner class
		 Scanner input = new Scanner(System.in);
		 
		 //Declare variables
		 int number, count;
		 double sumOfSquares;
		 
		 System.out.println("Enter positive integers (terminate input with -99) : ");
		 number = 0;
		 count = 0;
		 sumOfSquares = 0;
		  
		  
			 
			 
		 while (number != -99) 
		 {
			 System.out.print("Enter a number : ");
			 number = input.nextInt();
			 
			 if (number == -99)
			 {
				 break;
			 }
			 
			 if (number > 0 )
		     {
			 sumOfSquares += Math.pow(number, 2);
			 count++;
		     }
		 
		     else
		     {
			 System.out.println("Please enter a positive integer or -99to terminate ");
			 
		     }
		 
			 
		 }
		 
		 
		 
		 if (count > 0)
		 {
			 
			 //Calculate the Root Mean Square
			 double meanOfSquares = sumOfSquares/count;
			 double rms = Math.sqrt(meanOfSquares);
			 
			 
			 //Print RMS
			 System.out.println();
			 System.out.println("The Root Mean Square (RMS) is: " + rms);
		 }
		 
		 else 
		 {
			 System.out.println("No positive numbers were entered");
		 }
		 
 }
 }