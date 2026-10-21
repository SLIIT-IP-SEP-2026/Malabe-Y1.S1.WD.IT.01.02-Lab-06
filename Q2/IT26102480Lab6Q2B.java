import java.util.Scanner;
public class IT26102480Lab6Q2B{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		int count= 0,number;
		 
		String numberStringType="";
		
		while (count<10){
			System.out.print("Enter number " + (count+1) +" : ");
			number = input.nextInt();
			numberStringType = numberStringType + number + " ";
			count++ ;
		}
		
			System.out.println("\nThe numbers you entered are:");
			System.out.println(numberStringType);
		
			
	}
}
