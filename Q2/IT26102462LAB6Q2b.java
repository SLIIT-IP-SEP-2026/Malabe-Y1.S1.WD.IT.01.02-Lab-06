import java.util.Scanner;
public class IT26102462LAB6Q2b{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);
	 double[]number = new double[10];
	 
	 for (int a=0; a<10;a++){
	 System.out.print("Enter number"+(a+1)+":");
	 number[a]=input.nextDouble();
	 
	 
	 }
	  System.out.println("The number you entered are:");
	  for (int a=0; a< 10;a++){
	   System.out.print(number [a]  + " ");
	  
	  }
	 
	 
	 
	 
	 }
	 }