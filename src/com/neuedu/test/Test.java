package com.neuedu.test;

public class Test {
    public static void main(String[] args) {
        int i = 146325;
        int m = 0;
        while (i != 0) {
            m =i%10;
            System.out.print(m);
            i = i/10;
        }
        System.out.println(1);
    }

}
