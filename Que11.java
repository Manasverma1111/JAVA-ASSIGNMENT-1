package Assignment02;

import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=n;
        long x=0;
        long revs=0;
        long s=0;
        long c=n;
        long f=1;
        long g=0;
        while(c>0){
            long d=c%10;
            s++;
            c/=10;
        }
        while(a!=0)
        {
          long  rem=a%10;
            x=9-rem;
            if(f==s){
                revs=(long)(revs*10+rem*Math.pow(10,g));
                break;
            }
            if(x==0) {
                //revs = 1;
                g++;
            }
            if(x<rem)
            {

                revs=revs*10+x;
            }
            else if(x>rem)
            {
                revs=revs*10+rem;
            }
            f++;
            a=a/10;
        }
        long b=revs;
        long revs2=0;
        while(b!=0)
        {
         long   rem2=b%10;
            revs2=revs2*10+rem2;
            b=b/10;
        }
        System.out.println(revs2);
    }
}
