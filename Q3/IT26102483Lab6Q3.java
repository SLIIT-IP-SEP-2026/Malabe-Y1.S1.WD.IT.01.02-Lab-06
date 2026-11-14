import java.util.Scanner;
public class IT26102483Lab6Q3
{
	public static void main(String[]args)
	{
		int number;
		double meanOfSquares,rms;
		double sumOfSquares=0;
		int count=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter positive integers (terminate input with -99):");
		while (true){
			System.out.print("Enter a number:");
			number=input.nextInt();
			if (number== -99){
				break;
			}
		    if (number>0){
				sumOfSquares+=Math.pow(number,2);
				count++;
			}
			else{
				System.out.print("Invalid input.Please enter a positive integers:");
			}
		}
		if (count>0){
			meanOfSquares=sumOfSquares/count;
			rms=Math.sqrt(meanOfSquares);
			System.out.println();
			System.out.print("The Root Mean Square (RMS)is "+ rms);
		}
		else{
			System.out.println("No positive numbers were entered");
		}
	}
}
			
				
				
				
}