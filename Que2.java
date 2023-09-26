package Assignment02;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int d= sc.nextInt();
        int i=0;
        while(num>0){
            int r=num%10;
            if (r==d){
                i++;
            }
            num=num/10;
        }
        System.out.print(i);
    }
}
