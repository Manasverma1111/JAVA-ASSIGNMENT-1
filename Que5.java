package Assignment02;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend= sc.nextInt();
        int divisor=sc.nextInt();
        int a= divisor*dividend;
        int r=0;
        while(dividend%divisor!=0){
            r=dividend%divisor;
            dividend=divisor;
            divisor=r;
        }
        System.out.print(a/divisor);
    }
}
