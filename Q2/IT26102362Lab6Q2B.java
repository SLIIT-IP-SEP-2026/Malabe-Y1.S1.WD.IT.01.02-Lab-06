import java.util.Scanner;
public class  IT26102362Lab6Q2B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number, count = 1;
		String numberList = "";
		
		while (count<=10){
			System.out.print("Enter number "+ count +": ");
			number = input.nextInt();
			numberList = numberList+number+" ";
			count++;
		}
		System.out.println("\nThe numbers you entered are:\n"+numberList);	
	}
}