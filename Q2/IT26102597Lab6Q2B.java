import java.util.Scanner;
 public class IT26102597Lab6Q2B{
    public static void main(String [] args){

    //Create an object call input to Scanner class
    Scanner input = new Scanner(System.in);
    
	//Declare variables
    int[] numbers = new int [10] ;
    int a = 0;	
	
	//Take 1st user input
	System.out.println("Please enter 10 numbers: ");
	
	while (a < 10)
	{
		System.out.println("Enter number " + (a + 1) + ": ");
		numbers[a] = input.nextInt();
		a++;
	}		
	
	    System.out.println("The numbers you entered are : ");
	
    a = 0;
	
    while (a < 10)
	{
		System.out.print(numbers[a] + " ");
		a++;
	}
	

 }
 }