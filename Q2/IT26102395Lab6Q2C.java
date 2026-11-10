import java.util.Scanner;

public class IT26102395Lab6Q2C {
   public static void main(String[] args) {
     
    Scanner ok= new Scanner(System.in);
    int i=1;
    String numbers= " " ;
    int sum=0;
    double Average=0;
    while(i<=10){
        System.out.print("Enter number "+i+":");
        int num=ok.nextInt();

        numbers=numbers+ num +" ";
        sum=sum+num;
        Average=sum/10;

        i++;
    }
    System.out.println(numbers);
    System.out.println("Sum of the numbers " +sum);
    System.out.println("Sum of the numbers" +Average);

   }
}
