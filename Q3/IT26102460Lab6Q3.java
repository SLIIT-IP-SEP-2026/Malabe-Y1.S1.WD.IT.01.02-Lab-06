import java.util.Scanner;
public class IT26102460Lab6Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double rootMeanSquare;
		int number = 0;
		int sum =0;
		int count = 0;
		
		while(number != -99){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if(number >= 0){
				sum += Math.pow(number, 2);
				count++;
			}
			else{
				System.out.println("Please enter a positive number.");
			}
		}
		System.out.println();
		rootMeanSquare = Math.sqrt(sum/count);
		System.out.println("Root Mean Square: " + rootMeanSquare);
	}
}