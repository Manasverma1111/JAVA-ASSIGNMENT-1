package Assignment02;
import java.lang.Math;
import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0;
        double x = n;
        int b=n;
        double i=0;
        while(b!=0){
            i++;
            b=b/10;
        }
        while (n != 0) {
            double r = n % 10;
            s = s + Math.pow(r,i);
            n = n / 10;
        }
        if (s == x) {
            System.out.print("true");
        } else {
            System.out.print("false");

        }
    }
}

