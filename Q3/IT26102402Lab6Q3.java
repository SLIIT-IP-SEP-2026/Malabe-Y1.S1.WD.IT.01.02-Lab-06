import java.util.Scanner;
public class IT26102402Lab6Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number;
		double rms;
		int count = 0;
		double  sum = 0;
		
		System.out.println("Enter positive integers (terminate input with -99): ");
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		while(number!= -99){
			if(number < 0){
				System.out.println("Invalid input. Enter a positive integer or -99 to terminate");
			}else{
				sum = sum + (double) number * number;
				count++;
			}
			
			System.out.print("Enter a number: ");
			number = input.nextInt();
		}
		
		if(count > 0){
			rms = Math.sqrt(sum / count);
			System.out.println("The The Root Mean Square(RMS) is: "+rms);
			
		}else{
			System.out.println("No posiitve numbers were entered.");
		}
		
	}
}