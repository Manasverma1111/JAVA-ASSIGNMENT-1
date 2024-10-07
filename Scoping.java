package com.manas;

public class Scoping {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        //System.out.println(num);    //can't be accessed here

        {
            a = 40; //reassigning the original ref var to other value
            System.out.println(a);
            int c = 30;
            System.out.println(c);  //block scoping

            for(int i = 0; i < 4; i++){
                System.out.println(i);
            }

            //initialized values can't be accessed outside of this block
        }
    }
    static void random(){
        //System.out.println(a);  //can't be accessed here
        int num = 30;
    }
}
