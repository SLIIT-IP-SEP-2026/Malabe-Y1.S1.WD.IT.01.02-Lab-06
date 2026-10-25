import java.util.Scanner;
public class IT26102462LAB6Q3{
    public static void main (String []args){

    int number;
	int count=0;
	double sumOfSqures=0;
	double meanOfSquares,rms;

Scanner input = new Scanner(System.in);
System.out.println("Enter positive integer (terminate input with -99):");

while (true){
	System.out.print("Enter a number:");
	number=input.nextInt();
	if (number==-99){
		break;
	}
	if (number>0){
		sumOfSqures += Math.pow(number,2);
		count++ ;
	}
	else{
		System.out.println("invalid input.Please enter a positive integer or -99 to terminate");
		
	
	}
}

     if (count>0){
		 meanOfSquares=sumOfSqures/count;
		 rms = Math.sqrt(meanOfSquares);
		 
		 System.out.println();
		 System.out.println ("The Root mean square(RMS) is :"+rms);
		 
	 }
      else {
		  System.out.print("No positive number were entered");
		  
	  }

}

}