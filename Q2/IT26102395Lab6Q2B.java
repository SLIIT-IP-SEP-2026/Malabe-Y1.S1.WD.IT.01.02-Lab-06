import java.util.Scanner;

public class IT26102395Lab6Q2B {
   public static void main(String[] args) {
     
    Scanner ok= new Scanner(System.in);
    int i=1;
    String numbers= " " ;
    while(i<=10){
        System.out.print("Enter number "+i+":");
        int num=ok.nextInt();

        numbers=numbers+ num +" ";

        i++;
    }
    System.out.println(numbers);
   }
}

