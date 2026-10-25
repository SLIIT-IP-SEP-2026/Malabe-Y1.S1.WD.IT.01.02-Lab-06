import java.util.Scanner;
public class IT26102421Lab6Q1{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 
 System.out.print("Enter the number: ");
 int number=sc.nextInt();
 
 if (number<=0){
	 System.out.print("The number must be greater than zero");
 }
	 int squareNumber=number*number;
	 double squareRoot=Math.sqrt(number);
 
 System.out.println("The square of the number is: "+ squareNumber);
 System.out.println("The squareroot of the number is: "+ squareRoot);
 }
}