import java.util.Scanner;
public class IT26102480Lab6Q3{
	public static void main(String[]args){
		int  count=0 , num;
		double sqrSum=0 , rms;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99):");
		
		System.out.print("Enter a number:");
		num = input.nextInt();
		
		while (num != -99){
			if (num > 0){
				sqrSum= sqrSum + Math.pow(num,2);
				count++;
				System.out.print("Enter a number:");
				num = input.nextInt();
			}
			else {
				System.out.println("Invalid input. please enter a positive integer or -99 to terminate");
				break;
			}
		}
		rms = Math.sqrt(sqrSum/count);
		
		System.out.println("The Root Mean Squre (RMS) is:"+ rms);
		
		
	}
}