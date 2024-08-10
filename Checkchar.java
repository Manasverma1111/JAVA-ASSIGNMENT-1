import java.util.*;
public class Checkchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>=97 && ch<=122)|| (ch>=65 && ch<=90)){
            System.out.println("alphabet");
        }
        else if (ch>=48 && ch<=57){
            System.out.println("Digit");
        }
        else {
            System.out.println("special character");

        }
    }
}
