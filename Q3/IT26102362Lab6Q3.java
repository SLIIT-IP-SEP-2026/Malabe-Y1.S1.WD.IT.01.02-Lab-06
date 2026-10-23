import java.util.Scanner;
public class IT26102362Lab6Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int count = 0, number;
		double sum = 0, average, rootMeanSquare;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		while (number != -99){
			if (number>0){
				sum += (double)number*(double)number;
				count++;	
			}
			else{
				System.out.print("Please enter a positive integer or -99 to terminate");
			}
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
		}
		if (count>0){
			average = sum/count;
			rootMeanSquare = Math.sqrt(average);
			System.out.println("\nRoot Mean Square (RMS) is: "+ rootMeanSquare);
		}
	}
}