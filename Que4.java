package Assignment02;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int m=1;
        while(n>0){
            int r=n%10;
            sum=sum+r*m;
            n=n/10;
            m*=2;
        }
        System.out.print(sum);
    }
}
