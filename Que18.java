package Assignment02;

import java.util.Scanner;

public class Que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long M = sc.nextInt();
            long N = sc.nextInt();
            int a=0;
            int h=0;
           // System.out.println(1%2);
            for(int k=1 ; ; k++){
                if(k%2==0){
                    h+=k;
                }else{
                    a+=k;
                }
                if(a>M){
                    System.out.println("Harshit");
                    break;
                }
                if(h>N){
                    System.out.println("Aayush");
                    break;
                }
            }
        }
    }

}
