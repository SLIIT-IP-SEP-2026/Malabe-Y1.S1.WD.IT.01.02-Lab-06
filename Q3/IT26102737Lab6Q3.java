import java.util.Scanner;
public class IT26102737Lab6Q3
{
    public static void main(String[] args)
	{
        Scanner ip = new Scanner(System.in);
        int num;
        int count = 0;
        double sumSquare = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while(true){
            System.out.print("Enter a number: ");
            num = ip.nextInt();

            if(num == -99){
                break;
            }

            if(num < 0){
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquare += num * num;
            count++;
        }

        if(count > 0){
            double rms = Math.sqrt(sumSquare / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            // number ekakwath enter nokaloth kiyala dammoth hoda
            System.out.println("\nThe Root Mean Square (RMS) is: 0.0");
        }
    }
}