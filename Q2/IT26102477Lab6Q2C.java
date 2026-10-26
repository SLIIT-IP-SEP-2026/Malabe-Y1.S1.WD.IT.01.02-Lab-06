import java.util.Scanner;
public class IT26102477Lab6Q2C {
    public static void main(String [] args){
	
	int number , count , sum;
	String numbers;
	double average;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter 10 number: ");
	
	sum = 0;
	count = 1;
	numbers = " ";
	
	
	while (count <= 10) {
		System.out.print( "Enter number " + count + ": ");
		number = sc.nextInt();
		numbers = numbers + number + " ";
		sum = sum + number;
		count++;
	}
	
	System.out.println("The numbers you print: ");
	System.out.println(numbers);
	
	
	System.out.println("Sum of the number: " + sum);
	average = sum /  10;
	System.out.println("Average of the number: " + average);
	
	}
}