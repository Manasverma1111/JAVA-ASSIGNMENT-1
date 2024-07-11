import java.util.*;
public class Factorial{
    public static void main(String [] args){
        long number;
        System.out.println("enter a number:");
        Scanner sc= new Scanner(System.in);
        number = sc.nextInt();
        long answer = fact(number);
        System.out.println("factorial of " + number + " is "  + answer );

    }
     static long  fact(long  n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n-1);
    }
}
