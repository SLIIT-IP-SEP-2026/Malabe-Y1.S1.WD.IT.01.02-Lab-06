import java.util.Scanner;

    public class IT26101754Lab6Q3 {
	
	   public static void main(String[] args) {
	   
	       int number;
		   double meanofSquares, rms;
		   double sumofSquares = 0;
		   int count = 0;
		   
		 Scanner input = new Scanner(System.in);
         System.out.println("Enter positive integers(terminate input with -99): ");
      while(true) {
             System.out.print("Enter a number : ");
             number = input.nextInt();
             if (number == -99) {
                break;
            }
			if(number>0) {
			   sumofSquares += Math.pow(number,2);
			   count++;
			}else{
                System.out.println("Invalid input.please enter a positive integers or -99");
            }
        }
        if(count>0) {
            meanofSquares = sumofSquares/count;
            rms = Math.sqrt(meanofSquares);

            System.out.println();
        System.out.println("The Root Square (RMS) is : " + rms );
        }
        else{
            System.out.println("No positive numbers were entered");
        }
        }
    }		
				