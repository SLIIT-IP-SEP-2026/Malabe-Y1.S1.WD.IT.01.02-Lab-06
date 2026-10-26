import java.util.Scanner ; 
public class IT26102736Lab6Q2C {
	public static void main (String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner (System.in); 
		
		//defining variables
		int count = 1 , number ,total = 0;
		double average;
		String allNumbers = "";
		
		//looping for 10 inputs
		while (count <= 10) {
			//get an input number
			System.out.print("Enter number " +count +": " );
			number = input.nextInt();
			 
			//calculating and Average of the
			total = total + number;
			
			//incrementing the loop
			count ++;
			
			//storing the entered numbers
			allNumbers = allNumbers + number +"  " ;
		}
			
		//Calculating average
		average = total / count;
		
		//Displaying all the entered numebrs
		System.out.println("\nThe Numebers you entered are: " +"\n" +allNumbers );
		System.out.println("\nSum of the Numbers: " +total +"\nAverage of the Numbers: " +average);
	}
}
