import java.util.Scanner;
public class IT26102405Lab6Q2C {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix, numberSeven, numberEight, numberNine, numberTen;
	
		System.out.println("Please enter 10 numbers:");
		
		
		System.out.print("Enter number 1: ");
		numberOne = input.nextInt();
		System.out.print("Enter number 2: ");
		numberTwo = input.nextInt();
		System.out.print("Enter number 3: ");
		numberThree = input.nextInt();
		System.out.print("Enter number 4: ");
		numberFour = input.nextInt();
		System.out.print("Enter number 5: ");
		numberFive = input.nextInt();
		System.out.print("Enter number 6: ");
		numberSix = input.nextInt();
		System.out.print("Enter number 7: ");
		numberSeven = input.nextInt();
		System.out.print("Enter number 8: ");
		numberEight = input.nextInt();
		System.out.print("Enter number 9: ");
		numberNine = input.nextInt();
		System.out.print("Enter number 10: ");
		numberTen = input.nextInt();
		
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.print(numberOne + " ");
		System.out.print(numberTwo + " ");
		System.out.print(numberThree + " ");
		System.out.print(numberFour + " ");
		System.out.print(numberFive + " ");
		System.out.print(numberSix + " ");
		System.out.print(numberSeven + " ");
		System.out.print(numberEight + " ");
		System.out.print(numberNine + " ");
		System.out.println(numberTen + " ");
		
		System.out.println();
		
		int numSum = numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix + numberSeven + numberEight + numberNine + numberTen;
		double numAvg= (double) numSum / 10;
		System.out.println("Sum of the numbers: " + numSum);
		System.out.println("Average of the numbers: " + numAvg);
		
		
	
	}

}