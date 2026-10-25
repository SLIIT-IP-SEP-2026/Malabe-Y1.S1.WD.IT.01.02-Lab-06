import java.util.Scanner;

 public class IT26102000Lab6Q3{
 
 public static void main(String[] args){
 
  double number = 0, square, sumOfSquare = 0, rootMeanSquare, count = 0;
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter positive integers(terminate input with -99).\n");
  
  while (true){
  
  System.out.print("Enter a number: ");
  number = input.nextDouble();
  
   if(number == -99){
   break;
   }
  
   if(number < 0 ){ 
    System.out.println("Invalid input.Please enter a positive integer or -99 to terminate.");
	return;
   }
   
   square = Math.pow(number,2);
   sumOfSquare += square;
   count++;
   
   }
   
   if(count > 0){
   rootMeanSquare = Math.sqrt(sumOfSquare/count);
   System.out.println("The Root Mean Square (RMS) is: "+rootMeanSquare);
   }
   
   else{
	  System.out.println("No integers were entered."); 
	   }
	   
   }
   
  }
  
 
 
 