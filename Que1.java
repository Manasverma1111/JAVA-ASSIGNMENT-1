package Assignment02;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x=1;
        int sum1=0;
        int sum2=0;
        while(n>0){
          int r=n%10;
          if(x%2==0) {
              sum1 += r;
          }
          else{
              sum2+=r;
          }
          n=n/10;
          x++;
        }
        System.out.println(sum2);
        System.out.print(sum1);

    }
}
