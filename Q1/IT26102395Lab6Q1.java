import java.util.Scanner;
public class IT26102395Lab6Q1{
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = ok.nextInt();
        double squrt=num*num;
        System.out.println("The square of " + num + " is :"+ squrt);
        double root=Math.sqrt(num);
        System.out.println("The square root of " + num + " is :"+ root);

    }
}