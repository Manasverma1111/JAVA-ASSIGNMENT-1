package Assignment02;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int sum=0;
        for (int i=1;i<=x;i++){
            if(x%i==0){
                sum++;
            }
        }
        if(sum==2){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}
