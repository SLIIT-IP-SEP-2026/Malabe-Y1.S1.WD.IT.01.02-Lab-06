import java.util.Scanner;
public class IT26102462LAB6Q2c{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);
	 double[]number = new double[10];
	 double average, sum=0;
	 
	 for (int a=0; a<10;a++){
	 System.out.print("Enter number"+(a+1)+":");
	 number[a]=input.nextDouble();
	 sum=sum+number[a];
	 
	 
	 }
	  System.out.println("The number you entered are:");
	  for (int a=0; a< 10;a++){
	   System.out.print(number [a]  + " ");
	  
	  }
	  average=sum/10;
	 System.out.println("\n sum of the number:"+sum);
	 System.out.println("average of the number:"+average);
	 
	 
	 
	 
	 }
	 }