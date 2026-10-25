import java.util.Scanner;
public class IT26102421Lab6Q3{
 public static void main(String[] args){
	 int sqrsum=0;
	 int count=0;
 Scanner sc=new Scanner(System.in);
 
 System.out.print("Enter a number: ");
 int number=sc.nextInt();
 
 while(number!=-99){
	 if (number>=0){
		 sqrsum+=number*number;
		 count++;
	}
	else{
		System.out.print("Error: Enter a positive number: ");
	}
	System.out.print("Enter a number: ");
	number=sc.nextInt();
 }
 
 double rms=Math.sqrt(sqrsum/count);
 System.out.print("The Root Mean Square is: "+ rms);
 }
}