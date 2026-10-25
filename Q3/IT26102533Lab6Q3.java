import java.util.Scanner;

public class IT26102533Lab6Q3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;
		double meanofSquares, rms;

		double sumofSquares = 0;
		int count = 0;

		System.out.println("Enter positive integers (terminate input with -99) : ");

		System.out.print("Enter a number: ");
		number = input.nextInt();

		while (number != -99) {

			if (number > 0) {
				sumofSquares = sumofSquares + number * number;
				count++;
			} else {
				System.out.println("Invalid input. Please enter a positive integer");
			}

			System.out.print("Enter a number: ");
			number = input.nextInt();
		}

		if (count > 0) {
			meanofSquares = sumofSquares / count;
			rms = Math.sqrt(meanofSquares);
			System.out.println("Root mean square (RMS) is : " + rms);
		} else {
			System.out.println("No valid numbers entered");
		}

		
	}
}