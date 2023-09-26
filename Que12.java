package Assignment02;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
        long sum=0;
        long x=n;
        long a=n;
        double z=0;
        while(a!=0){
            long j= a%10;
            z++;
            a=a/10;
        }
        if(n==0){
            sum=5;
        }
        while(n!=0){
            long r=n%10;
            if(r==0) {
                r=5;
                sum = sum*10 + r;
            }
            else{
                sum = sum*10 + r;
            }

                n = n / 10;
        }
        long sum2=0;
        while(sum!=0){
            long j= sum%10;
            sum2=sum2*10+j;
            sum=sum/10;
        }
        System.out.print(sum2);
    }
}
