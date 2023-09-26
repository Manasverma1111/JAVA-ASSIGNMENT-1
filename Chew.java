package My;

import java.util.Scanner;

public class Chew {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long ans = Chewbacca(n);
//        System.out.println(ans);
//    }
//    public static long Chewbacca(long a) {
//        String Str = String.valueOf(a);
//        char[] num = Str.toCharArray();
//        for (int i = 0; i < num.length; i++) {
//            int j = num[i] - '0';
//            if (i != 0 && j > 4) {
//                j = 9 - j;
//                num[i] = (char) (j + '0');
//            }
//        }
//        long res = Long.parseLong(new String(num));
//        return res;
//    }
//}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x = scn.nextLong();
        long[] arr = new long[20];
        int c = 0;
        long n=x;
        while (n != 0) {
            long r = n % 10;
            arr[c] = r;
            c++;
            n = n / 10;
        }
        for (int i = 0; i < c; i++) {
            if (i != c - 1) {
                if (arr[i] >= 5) {
                    arr[i] = 9 - arr[i];
                }
            } else {
                if (arr[i] >= 5 && arr[i] <= 8) {
                    arr[i] = 9 - arr[i];
                }
            }
        }
        for (int i = c - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}







