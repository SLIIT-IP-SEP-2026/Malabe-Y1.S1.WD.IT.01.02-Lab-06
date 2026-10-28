import java.util.Scanner;

import java.util.Scanner;

public class IT26102636Lab6Q2B {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int i = 0;
        String numbersStr = "";
        
        System.out.println("Please enter 10 numbers:");
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ":");
            int num = input.nextInt();
            
            // Build string without trailing spaces using an if-else check
            if (i == 0) {
                numbersStr = Integer.toString(num);
            } else {
                numbersStr += " " + num;
            }
            i++;
        }
        
        System.out.println("The numbers you entered are:");
        System.out.println(numbersStr);
        
    }
}