package Assignment02;

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        for (int i = N1; i <= N2; i++) {
            int a=i;
            int b=i;
            int x=0;
            while(b!=0){
                x++;
                b=b/10;
            }
            int sum=0;
            while(a!=0){
                int r=a%10;
                sum=sum+(r*r*r);
                a=a/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
}
