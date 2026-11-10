import java.util.Scanner;

public class IT26102567Lab6Q2B {
    public static void main(String[] args) {
    
        // Create new scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 10 numbers: ");
        
        int i = 1;
        String result = "";
        
        // Use a while loop to accept numbers input by keyboard
        while(i <= 10) {
            System.out.println("Enter number " + i + ":");
            int number = input.nextInt();  // Fixed: changed Scanner:nextInt() to input.nextInt()
            
            result = result + number + " ";
            i++;
        }
        
        // Print the output
        System.out.println("The numbers you entered are: ");
        System.out.println(result);
        
        input.close();
    }
}