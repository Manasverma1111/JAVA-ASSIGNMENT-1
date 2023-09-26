package Assignment02;

import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 1; j <= T; j++) {
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
            while (n != 0) {
                int r = n % 10;
                if (r % 2 == 0) {
                    sum += r;
                } else {
                    sum1 += r;
                }
                n = n / 10;
            }
            if (sum % 4 == 0 || sum1 % 3 == 0) {

                    System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        }
    }
}
