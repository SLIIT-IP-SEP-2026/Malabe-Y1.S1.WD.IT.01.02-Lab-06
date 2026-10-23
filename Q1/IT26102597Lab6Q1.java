import java.util.Scanner;
 public class IT26102597Lab6Q1{
	 public static void main(String [] args){
		 
		 //Create an object called input to scanner class
         Scanner input = new Scanner (System.in);

         //Declare variables
         double number, square, squareroot;

         System.out.println("Enter a number");
          number = input.nextInt();
       
       	 //Calculate the square of the number
		  square = (number * number);
		 
		 //Calculate the square root of the number
		  squareroot = Math.sqrt(number);
		 
		 if (number <= 0)
		 {
			 System.out.println("Terminating the program");
			 return; //Exit the program
		 }
		 
		 else
		 {
			 System.out.println("The square of " + number + " is : "  + String.format("%.2f", square));
			 System.out.println("The square root of " + number + " is : " + String.format("%.2f", squareroot));
		 }
         		 
		    
    }
			
}