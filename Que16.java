package Assignment02;

import java.util.Scanner;

public class Que16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int sn=sc.nextInt();
        int sum=0;
        int m=1;
        int sn2=0;
        int m1=1;
        while(sn!=0){
            int j= sn%10;
            sn2=sn2+j*m1;
            sn=sn/10;
            m1*=sb;
        }
        System.out.println(sn2);
        while(sn2>0){
            int r=sn2%db;
            sum=sum+r*m;
            sn2=sn2/db;
            m*=10;
        }
        System.out.print(sum);
    }
}
