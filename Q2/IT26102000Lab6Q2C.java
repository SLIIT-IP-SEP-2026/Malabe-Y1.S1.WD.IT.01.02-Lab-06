import java.util.Scanner;

public class IT26102000Lab6Q2C{

public static void main(String[] args){

int number = 0, count = 1, value, num1=0, num2=0, num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0;
double sum = 0, average;

Scanner sc = new Scanner(System.in);
 
 while(count <= 10) {
 
 
 System.out.print("Enter number "+count+": ");
 number = sc.nextInt();
 
  if (count == 1){
	 num1 = number;
  }
  else if (count == 2){
	 num2 = number; 
  }
  else if (count == 3){
	 num3 = number;
  }
  else if (count == 4){
	 num4 = number;
  }
  else if (count == 5){
	 num5 = number;
  }
  else if (count == 6){
	 num6 = number;
  }
  else if (count == 7){
	 num7 = number;
  }
  else if (count == 8){
	 num8 = number;
  }
  else if (count == 9){
	 num9 = number;
  }
  else if (count == 10){
	 num10 = number;
  }
 count++;
  sum = sum + number;

 
 }
 
 average = sum/10;
 
 System.out.println("\nThe numbers you entered are:\n"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10+"\n");
 System.out.println("\nSum of the numbers: "+sum);
 System.out.println("Average of the numbers: "+average);
 
}

}