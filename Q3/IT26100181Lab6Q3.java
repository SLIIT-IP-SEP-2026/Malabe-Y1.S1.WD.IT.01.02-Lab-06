import java.util.Scanner;
public class IT26100181Lab6Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers(to terminate input with -99): ");

		int total = 0; //To get the total...
		int sqOfNum = 0; //To get the square of the number...
		int count = 0; //To get the loop count...
		
		// Creating to loop to get the inputs...
		L1:while(true){
			System.out.print("Enter a number : ");
			int num = input.nextInt();
			
			//To terminate the loop...
			if(num == -99){
				break;	
			}
			//Checking whether there is negative inputs...
			if(num < 0){
				System.out.println("Please enter a positive integer or -99 to terminate");
				continue L1;
			}
			
			sqOfNum = num*num;
			total += sqOfNum ; 	
			
			count += 1;
		}
		double avg = (double)total/count;//Getting the average of the squared numbers...
		double rms = Math.sqrt(avg);//Getting the RMS...
		System.out.println("The Root Mean Square (RMS) is : "+ rms);

		
	}
}
