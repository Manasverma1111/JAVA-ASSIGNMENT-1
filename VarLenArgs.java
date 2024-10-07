package com.manas;
import java.util.Arrays;

public class VarLenArgs {
    public static void main(String[] args) {
        fun();
        multiple(2, 4, "alpha");
    }

    static void multiple(int a, int b, String ...v){
    }
    static void fun(int ...v){   //array od int, char, str
        System.out.println(Arrays.toString(v));
    }
}
