package Assignment02;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.print(sum);
    }
}