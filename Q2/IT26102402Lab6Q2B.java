import java.util.Scanner;
public class IT26102402Lab6Q2B{
	public static void main(String[]args){		
		Scanner input = new Scanner(System.in);
		
		int[] number = new int[10];
		int i = 0;
		
		System.out.println("Please enter 10 numbers: ");
		
		while (i < 10){
			System.out.print("Enter number " + (i + 1) + ": ");
			number[i] = input.nextInt();
			i++;
		}
		
		System.out.println("The numbers you entered are: ");
		
		i = 0;
		while(i<10){
			System.out.print(number[i] + " ");
			i++;
		}
		
	}
}