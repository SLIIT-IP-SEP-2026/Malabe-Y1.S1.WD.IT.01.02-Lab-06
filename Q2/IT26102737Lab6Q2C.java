import java.util.Scanner;
public class IT26102737Lab6Q2C{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

        int number, count=1, sum=0;
        double average;
        		
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
        
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();
            sum += number;
            numbers = numbers + number + " ";
            count++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        
        average = sum/10;
                
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);   
    }
    
}