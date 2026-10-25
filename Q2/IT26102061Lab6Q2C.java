import java.util.Scanner;
public class  IT26102061Lab6Q2C{
	public static void main(String[] args){
		int num,key,sum;
		num=1;
		sum=0;
		
		Scanner input=new Scanner(System.in);
		
		//store the user input data as string type
		String output=""; 
		
		System.out.println("Please enter 10 numbers:");
		
		
		while(num<=10){
					
			System.out.print("Enter number "+num+": ");
			key=input.nextInt();
				
			//save input keys as a string with space
			output=output+key+" ";
			
			sum=sum+key;
				
			num++;
		}
			
		double ave=sum/10;	
		System.out.print("\nThe numbers you entered are :\n"+output+"\n");	
		System.out.println("\nSum of the numbers you enterd are : "+sum);
		System.out.println("Average of the numbers : "+ave);
		
	}
}

			
		