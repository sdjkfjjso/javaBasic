package com.neuedu.test;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入半径");
        int a=input.nextInt();
        Circle circle=new Circle();
         circle.radius(a);
    }

}
