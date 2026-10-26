import java.util.Scanner;
public class IT26102479Lab6Q2C{

       public static void main(String[] args){
	     
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Please enter 10 numbers:");
		  
		  int i = 1;
		  String numbers_entered =" ";
		  int sum = 0;
		  
		  while (i <= 10){
		      System.out.print("Enter number " + i + " ");
			  int num =input.nextInt();
			  
			  
		  numbers_entered = numbers_entered + num + " ";
		  
		  sum = sum + num;
		  
		  i++;
		  }
		  
		  double average = sum/10;
		  
		  
		  System.out.println("\nthe numbers you entered are:");
		  System.out.println(numbers_entered);
		  System.out.println("\nsum of the numbers: " + sum);
		  System.out.println("average of the numbers:"  + average);
		  
		  input.close();
		  
		}
	}