package Assignment02;
import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2= sc.nextInt();
        int i=1;
        for(int n=1 ; n<=N1 ; ){
            int sum= 3*i+2;
            if (sum%N2!=0){
                System.out.println(sum);
                n++;
            }
            i++;
        }
    }
}
