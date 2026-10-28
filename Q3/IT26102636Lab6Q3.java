import java.util.Scanner;

public class IT26102636Lab6Q3{
	
	public static void main(String[]args){
		
		//Declare the variables
		int number;
		double meanOfSqures , rms;
		
		//Declare and Initialise variable to hold the sum of squre and the count
		double sumOfSqures=0;
		int count = 0 ;
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Promt the user to enter numbers
		System.out.println("Enter positive integers(terminate input with -99): ");
		
		//Read numbers until -99 is encountered
		while(true){
			
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if (number == -99){
				break;
			}
			
			if(number > 0){
				
				//Update the sum of squres and count
				sumOfSqures += Math.pow(number, 2 );
				
				count++;
			}else{
				
				//Notify user of invalid input(Negative number other than -99)
				System.out.println("Invalid input.Please enter a positive integer");
			}
		}
		
		//Check if any valid numbers were entered
		if(count>0){
			
			//Calculate Root Mean Squre(RMS)
			meanOfSqures = sumOfSqures/count;
			rms=Math.sqrt(meanOfSqures);
			
			//Print the RMS result
			System.out.println();
			System.out.println("The Root Mean Squre (RMS)is: " +rms);
		}
		else{
		
        //Notify user of invalid input (Negative number other than -99)	
        System.out.println("No positive numbers were entered");		
		}
	}
}