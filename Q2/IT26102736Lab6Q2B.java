import java.util.Scanner ; 
public class IT26102736Lab6Q2B {
	public static void main (String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner (System.in); 
		
		//defining variables
		int count = 1 , number;
		String allNumbers = "";
		
		
		//looping for 10 inputs
		while (count <= 10) {
			//get an input number
			System.out.print("Enter number " +count +": " );
			number = input.nextInt();
			
			//incrementing the loop
			count ++;
			
			//storing the entered numbers
			allNumbers = allNumbers + number +"  " ; 
		}
			
		//Displaying all the entered numebrs
		System.out.println("\nThe Numebers you entered are: " +"\n" +allNumbers );
	}
}
