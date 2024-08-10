import java.util.*;
class firstlast{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int firstdigit=0;
        int lastdigit=0;
        lastdigit= num%10;
        System.out.println("lastdigit is:" +lastdigit);

          while(num!=0){
            firstdigit= num%10;
            num= num/10;

          }
          System.out.println("firstdigit is:" +firstdigit);
          sc.close();
    }
}


