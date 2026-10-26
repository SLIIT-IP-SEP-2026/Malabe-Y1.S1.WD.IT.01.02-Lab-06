import java.util.Scanner ; 
public class IT26102736Lab6Q3 {
	public static void main (String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner (System.in); 
		
		//defining variables
		int count = 1 , number ,sqrNumber ,sqrNumberTotal = 0;
		double rms;
		
		//looping for valid inputs
		while (true) {
			//get an input
			System.out.print("Enter number " +count +": " );
			number = input.nextInt();
			
			//Validating input for positive integers to continue and -99 to exit
			if (number == -99) {
				break;
			}else if ( number <= 0) {
				System.out.println("Enter a positive integer or -99 to terminate the program");
			}else{
				sqrNumber = number*number ; 
				sqrNumberTotal = sqrNumberTotal + sqrNumber;
			}
			
			//incrementing the loop
			count ++;
		
		}
			
		//Calculating root-meansqr Number
		
		rms = Math.sqrt((sqrNumberTotal / count));
		
		//Displaying the RMS
		System.out.println("\nThe Root Mean Square (RMS) is: " +rms);
	}
}
