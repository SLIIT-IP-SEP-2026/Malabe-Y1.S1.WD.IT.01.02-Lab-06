import java.util.Scanner;
public class  IT26102061Lab6Q2B{
	public static void main(String[] args){
		int num,key;
		num=1;
		Scanner input=new Scanner(System.in);
		
		//store the user input data as string type
		String output=""; 
		
		System.out.println("Please enter 10 numbers:");
		
		
		while(num<=10){
					
			System.out.print("Enter number "+num+": ");
			key=input.nextInt();
				
			//save input keys as a string with space
			output=output+key+" ";
				
			num++;
		}
			
			
		System.out.print("\nThe numbers you entered are :\n"+output);	
		
	}
}

			
		