import java.util.Scanner;
public class IT26102462LAB6Q1{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number:");
	 double number= input.nextDouble();
	 
	 if (number<=0){
		 System.out.print("Error");
	 }
	 
	 double square = number*number;
	 double square_root=Math.sqrt(number);
	 
	 System.out.println("The square" +number +"is :"+ square);
	 System.out.println("The square_root"+number+"is :"+square_root);




  }
}