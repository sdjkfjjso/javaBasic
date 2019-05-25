package com.neuedu.test;

import java.util.Scanner;

//水仙花数
public class Test1 {
    public static void main(String[] args)throws Exception{
// 1、       int num = 100;
//        int g,s,b;
//        for(num= 100;num<1000;num++){
//            g = num  % 10;
//            s = num / 10 % 10;
//            b = num / 100 ;
//            if(num == g*g*g+s*s*s+b*b*b ){
//                System.out.println(num);
//            }
//        }
// 2、  学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示
//     Scanner i = new Scanner(System.in);
//        int a = i.nextInt();
//        if(a>=90){
//            System.out.println("A");
//        }else if(a>=60&&a<90){
//            System.out.println("B");
//        }else{
//            System.out.println("C");
//        }
        //3、有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//        int  a =0;
//        for(int i=1;i<5;i++){
//            for(int j=1;j<5;j++){
//                for(int k=1;k<5;k++){
//                    if(i!=j&&j!=k&&i!=k){
//                        a++;
//                        System.out.println(i*100+j*10+k);
//                    }
//                }
//            }
//        }
//        System.out.println("共有"+a+"个不重复的三位数");
    //4、 计算9！
//        int sum=1;
//        for(int i=1;i<=9;i++){
//            sum*=i;
//        }
//        System.out.println(sum);

   //5、分别计算1-100之间的奇数和 和偶数和
//        int i = 0;
//        int j = 0;
//        for (int a = 1;a<=100;a++){
//            if (a%2==1){
//            i=a+i;
//            }else{
//            j=a+j;
//            }
//        }
//        System.out.println("奇数和为"+i+"   "+"偶数和为"+j);
//6、一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
//        Scanner sum = new Scanner(System.in);
//        int i = sum.nextInt();
//        int a = i / 10000;//万位
//        int b = i / 1000 - a * 10;//千位
//        int c = i % 100 / 10;//十位
//        int d = i % 10;//个位
//        if (i >= 10000 && i <= 99999) {
//            if (a == d && b == c) {
//                System.out.println("此数是回文数");
//            } else {
//                System.out.println("不是回文数");
//            }
//        }else{
//            System.out.println("请输入一个五位数");
//        }

        //7、判断一个年份是平年还是闰年
//        Scanner scan =new Scanner(System.in);
//        System.out.println("请输入年份");
//        int a =scan.nextInt();
//        if(a%4==0&&a%100!=0||a%400==0){
//            System.out.println("闰年");
//        }else {
//            System.out.println("平年");
//        }
//8,、编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
//        char a = (char)System.in.read();
//         if (a>='a'&&a<='z'){
//              a-=32 ;
//              System.out.println(a);
//          }else {
//             System.out.println(a);
//            }

        //9、用 while 循环，计算 1~200 之间所有 3 的倍数之和。
//        用 while 循环，计算 1~200 之间所有 3 的倍数之和。
//            int num = 0;
//            int i = 1;
//            while (i < 200) {
//                if (i % 3 == 0) {
////                == 判断是否相等
//                    num += i;
//                }
//                i++;
//            }
//            System.out.println("和为" + num);
//10、一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
//        Scanner i = new Scanner(System.in);
//        int a = i.nextInt();
//        int b = 0;
//        if (a>=0){
//            b+= a%10;
//            a = a/10;
//        }
//        b+=a;
//        if (b%9==0){
//            System.out.println("能被9整除");
//        }else {
//            System.out.println("不能被9整除");
//        }

    }

    }




