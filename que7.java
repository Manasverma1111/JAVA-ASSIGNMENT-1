package Assignment02;

import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        for(int i=min; i<=max ; i+=step){
            int cel=((i-32)*5)/9;
            System.out.println(i + "\t" + cel);

        }

    }
}
