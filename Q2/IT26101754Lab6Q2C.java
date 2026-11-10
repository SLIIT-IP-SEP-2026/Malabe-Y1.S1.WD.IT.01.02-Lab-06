import java.util.Scanner;

    public class IT26101754Lab6Q2C {
	
	   public static void main(String[] args) {
	   
	      Scanner Sc = new Scanner(System.in);
		  
		  int sum;
		  double avg;
		  
		  System.out.println("please enter the 10 numbers : ");
		  
		  
		  System.out.print("Enter number 1 : ");
		  int n1 = Sc.nextInt();
		  System.out.print("Enter number 2 : ");
		  int n2 = Sc.nextInt();
		  System.out.print("Enter number 3 : ");
		  int n3 = Sc.nextInt();
		  System.out.print("Enter number 4 : ");
		  int n4 = Sc.nextInt();
		  System.out.print("Enter number 5 : ");
		  int n5 = Sc.nextInt();
		  System.out.print("Enter number 6 : ");
		  int n6 = Sc.nextInt();
		  System.out.print("Enter number 7 : ");
		  int n7 = Sc.nextInt();
		  System.out.print("Enter number 8 : ");
		  int n8 = Sc.nextInt();
		  System.out.print("Enter number 9 : ");
		  int n9 = Sc.nextInt();
		  System.out.print("Enter number 10 : ");
		  int n10 = Sc.nextInt();
		  
		  System.out.println();
		  System.out.println("The numbers you entered are : ");
		  System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10 + " ");
		  System.out.println();
		  
		  sum = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
          avg = sum/10.0;

          System.out.println("Sum of the numbers : " +sum );
          System.out.print("Average of the numbers : " +avg );		  
		  
	}

}