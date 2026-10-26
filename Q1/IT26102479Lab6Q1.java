import java.util.Scanner;
public class IT26102479Lab6Q1{

      public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  double number,squre,squreroot;
	  
	  System.out.print("Enter a number");
	  number = input.nextDouble();
	  
	  squre = number * number;
	  squreroot = Math.sqrt(number);
	  
	  System.out.println("The squre of number is: " + squre);
	  System.out.println("The squreroot of number is: " + squreroot);
	  
	  input.close();
	  
	}
}