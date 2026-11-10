import java.util.Scanner;

public class IT26102567Lab6Q3{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		double sumOfSquares = 0;
		int count = 0;
		
		System.out.println("Enter positive integers(terminate input with -99): ");
		
		while(true){
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			
			if (num == -99){
				break;
				
			}else if (num < 0){
				System.out.println("Invalid input. Please enter a positive integer value or -99 to terminate");
			}else{ 
			
			sumOfSquares += (double) num * num;
			count ++;
			
			}
		}
		
	if(count > 0){
		double rootMeanSquare = Math.sqrt(sumOfSquares / count);
		System.out.println("The Root Mean Square is: " + rootMeanSquare);
	    } 
	
	scanner.close();
	}
	
}
		
		
		
		