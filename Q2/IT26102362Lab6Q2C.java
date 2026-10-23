import java.util.Scanner;
public class  IT26102362Lab6Q2C{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number, count = 1, sum = 0;
		String numberList = "";
		
		while (count<=10){
			System.out.print("Enter number "+ count +": ");
			number = input.nextInt();
			sum += number;
			numberList = numberList+number+" ";
			count++;
		}
		System.out.println("\nThe numbers you entered are:\n"+numberList);
		System.out.print("\nSum of the numbers: "+sum);
		System.out.print("\nAvarage of the numbers: "+(sum/10.0));
	}
}