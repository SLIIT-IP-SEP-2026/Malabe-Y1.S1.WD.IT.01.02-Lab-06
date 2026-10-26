import java.util.Scanner;
public class IT26102479Lab6Q2B{
       
	   public static void main(String[] args){
	   
	      Scanner input = new Scanner(System.in);
		  System.out.print("Please enter 10 numbers:");
	   
	      int i = 1;
	      String numbers_entered = " ";
	   
	      while (i <= 10){
	        System.out.print("Enter number " + i + " ");
			int num = input.nextInt();
			
			numbers_entered = numbers_entered + num + " ";
			i++;
			
		 }
		   System.out.println("\nthe numbers you entered are:");
		   System.out.println(numbers_entered);
		
		 input.close();
		 
	  }
	  
   }
		
		
	   

     