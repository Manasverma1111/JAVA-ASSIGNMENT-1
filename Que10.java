package Assignment02;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend= sc.nextInt();
        int divisor=sc.nextInt();
        int r=0;
        while(dividend%divisor!=0){
            r=dividend%divisor;
            dividend=divisor;
            divisor=r;
        }
    }
}
