import java.util.*;
public class Swaptwonumbersusingthirdvariable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firswt number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swap first number:" +a);
        System.out.println("Swap second number:" +b);
        sc.close();

    }
}