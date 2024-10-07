package com.manas;

public class Shadowing {
    static int a = 10;   //static: object independent, this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a);  //10
        int a = 20;
        System.out.println(a);  //20
        fun();
    }
    static void fun(){
        System.out.println(a);  //10
    }
}
