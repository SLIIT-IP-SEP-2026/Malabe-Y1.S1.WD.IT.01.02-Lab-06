import java.util.Scanner;
public class  IT26102061Lab6Q1{
	public static void main(String[] args){
		double num,square,root;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number :");
		num=input.nextDouble();
		
		if(num>=0){
			square=Math.pow(num,2);
			System.out.println("\nThe square of "+num+" is: "+square);
			
			root=Math.sqrt(num);
			System.out.println("The square root of "+num+" is: "+root);
		}
		else{
			System.out.println("\n---- Enter a valid number ----");
		}
	}
}

		
			
		
		
		