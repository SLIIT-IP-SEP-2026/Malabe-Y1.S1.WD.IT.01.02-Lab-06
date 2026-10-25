import java.util.Scanner;
public class IT26102061Lab6Q3{
	public static void main(String[]args){
		int num,count;
		Scanner input=new Scanner(System.in);
		
		count=0;
		double sumSqure=0;
		
		
		System.out.print("\nEnter positive integers (terminate input with -99)");
		
		System.out.print("\nEnter a number : ");
		num=input.nextInt();
		
		
		while(num!=-99){
			if(num>=0){
				count++;
				sumSqure=sumSqure+Math.pow(num,2);	
			}
			else{
				System.out.println("Invalid input : Please enter a Positive integer or -99 to terminate");
			}
			System.out.print("Enter a number : ");
			num=input.nextInt();
			
				
		}
		
		double root=Math.sqrt(sumSqure/count);
		if(count>0){
			System.out.println("\nThe Root Mean Square (RMS) is: "+root);
		}
	}
	
}
			
			
		
		
		