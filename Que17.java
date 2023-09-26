package Assignment02;

import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int sum1=0;
        int x=n;
        while(x>0){
            int r=x%10;
            sum=sum+r;
            x=x/10;
        }
        for(int i=2 ;i<=n ; i+=1){
            while(n%i==0){
                int z=i;
                int su=0;
                while(z>0){
                    int s=z%10;
                    su+=s;
                    z=z/10;
                }
                sum1+=su;
                n=n/i;
            }
        }
        if (sum==sum1){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}
