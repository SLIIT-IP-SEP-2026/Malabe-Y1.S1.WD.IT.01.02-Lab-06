import java.util.Scanner;
public class IT26102480Lab6Q1{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		double squreNum,squreRootNum;
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		
		if(num <= 0){
			System.out.println("Error:The number must be greater than zero");
		}
		else {
			squreNum = (num*num);
		    squreRootNum = Math.sqrt(num);
			System.out.println("The squer of "+num+" is "+squreNum);
			System.out.println("The squer root of "+num+" is "+squreRootNum);
		}
		
		

}
}