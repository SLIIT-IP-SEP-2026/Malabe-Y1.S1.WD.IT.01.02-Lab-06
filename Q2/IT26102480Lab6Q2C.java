import java.util.Scanner;
public class IT26102480Lab6Q2C{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		int count= 0,number,sum =0;
		double avg;
		 
		String numberStringType="";
		
		while (count<10){
			System.out.print("Enter number " + (count+1) +" : ");
			number = input.nextInt();
			numberStringType = numberStringType + number + " ";
			sum=sum + number;
			count++ ;
		}
			avg = sum/10.0;
			
			System.out.println("\nThe numbers you entered are:");
			System.out.println(numberStringType);
			System.out.println("\nSum of the numbers : "+sum);
			System.out.println("Average of the numbers : "+avg );
			
		
			
	}
}