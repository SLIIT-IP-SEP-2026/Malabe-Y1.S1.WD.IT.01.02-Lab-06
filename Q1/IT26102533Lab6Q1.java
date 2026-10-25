import java.util.Scanner;
public class IT26102533Lab6Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		
		int sqnum = num * num;
		
		System.out.println("The square of the number is : "+sqnum);
		
		double squarernum = Math.sqrt(num);
		
		System.out.println("The square root of the number is : "+squarernum);
	}
}