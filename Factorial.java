import java.util.*;
public class function{
    public static void  printFactorial(int n){
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("The Factorial of "+n +"is"+factorial);
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}