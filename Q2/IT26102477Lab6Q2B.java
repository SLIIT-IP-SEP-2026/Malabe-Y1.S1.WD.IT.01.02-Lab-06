import java.util.Scanner;
public class IT26102477Lab6Q2B {
    public static void main(String [] args){
	
	int number , count;
	String numbers;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter 10 number: ");
	
	count = 1;
	numbers = " ";
	
	
	while (count <= 10) {
		System.out.print( "Enter number " + count + ": ");
		number = sc.nextInt();
		numbers = numbers + number + " ";
		count++;
	}
	
	System.out.println("The numbers you print: ");
	System.out.print(numbers);
	
	}
}