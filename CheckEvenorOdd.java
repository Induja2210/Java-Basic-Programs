import java.util.*;
public class CheckEvenorOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();

        if(num%2==0){
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
}