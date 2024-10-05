import java.util.Scanner;

public class Newyearnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // input for each test case
            String result = canRepresent(n);
            System.out.println(result);
        }
        scanner.close();
    }

    static String canRepresent(int n) {
        int count2020 = n % 2020;
        int count2021 = (n - count2020) / 2020 - count2020;

        if (count2020 >= 0 && count2021 >= 0 && count2020 + count2021 * 2020 == n) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
