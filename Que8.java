package Assignment02;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum=0;
        int c=1;
        while(n>0){
            double r=n%10;
            sum=sum+c*Math.pow(10,r-1);
            n=n/10;
            c++;
        }
System.out.print((int)(sum));
    }
}
