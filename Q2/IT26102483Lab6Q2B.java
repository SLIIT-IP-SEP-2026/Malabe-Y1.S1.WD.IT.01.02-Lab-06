import java.util.Scanner;
public class IT26102483Lab6Q2B
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		int number=1;
		String allNumbers = "";
		System.out.println(" Please enter 10 numbers:");
		while (number<=10){
			System.out.print("Enter number"+number+":");
			int n=input.nextInt();
			allNumbers += n + " ";
			number+=1;
		}
		System.out.println(" ");
		System.out.println("The numbers you entered are: ");
		System.out.println(allNumbers);
	}
}