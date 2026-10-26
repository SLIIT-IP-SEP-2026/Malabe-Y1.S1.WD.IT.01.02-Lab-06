//Q2A
public class  IT26100181Lab6Q2A{
	public static void main(String[] args){
		int count = 1;	
		while(count <= 10){
			System.out.print(count + " ");
			count ++;	
		}	
		
	}
}

//Q2B
import java.util.Scanner;
public class  IT26100181Lab6Q2B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Please enter 10 numbers : ");
		
		System.out.print("Enter number 1:  ");
		int num1 = input.nextInt();
		
		System.out.print("Enter number 2:  ");
		int num2 = input.nextInt();
		
		System.out.print("Enter number 3:  ");
		int num3 = input.nextInt();
		
		System.out.print("Enter number 4:  ");
		int num4 = input.nextInt();
		
		System.out.print("Enter number 5:  ");
		int num5 = input.nextInt();
		
		System.out.print("Enter number 6:  ");
		int num6 = input.nextInt();
		
		System.out.print("Enter number 7:  ");
		int num7 = input.nextInt();
		
		System.out.print("Enter number 8:  ");
		int num8 = input.nextInt();
		
		System.out.print("Enter number 9:  ");
		int num9 = input.nextInt();
		
		System.out.print("Enter number 10:  ");
		int num10 = input.nextInt();
		
		// Printing the numbers....
		System.out.println("The number you entered are : ");
		System.out.println(num1 +" " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6  + " " + num7 + " " + num8 + " " + num9 + " " + num10);
	}
}


//Q2C
import java.util.Scanner;
public class  IT26100181Lab6Q2C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Please enter 10 numbers : ");
		
		System.out.print("Enter number 1:  ");
		int num1 = input.nextInt();
		
		System.out.print("Enter number 2:  ");
		int num2 = input.nextInt();
		
		System.out.print("Enter number 3:  ");
		int num3 = input.nextInt();
		
		System.out.print("Enter number 4:  ");
		int num4 = input.nextInt();
		
		System.out.print("Enter number 5:  ");
		int num5 = input.nextInt();
		
		System.out.print("Enter number 6:  ");
		int num6 = input.nextInt();
		
		System.out.print("Enter number 7:  ");
		int num7 = input.nextInt();
		
		System.out.print("Enter number 8:  ");
		int num8 = input.nextInt();
		
		System.out.print("Enter number 9:  ");
		int num9 = input.nextInt();
		
		System.out.print("Enter number 10:  ");
		int num10 = input.nextInt();
		
		// Printing the numbers....
		System.out.println("The number you entered are : ");
		System.out.println(num1 +" " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6  + " " + num7 + " " + num8 + " " + num9 + " " + num10);
		
		int sum = + num1 + + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		double avg = sum/10.0;
		
		System.out.println("Sum of the numbers :  " + sum);
		System.out.println("Average of the numbers : " + avg);
	}
}