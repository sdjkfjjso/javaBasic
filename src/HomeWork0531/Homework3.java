package HomeWork0531;

import java.util.Scanner;
//最大公约数
public class Homework3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入a:");
//        int a = scanner.nextInt();
//        System.out.println("请输入b:");
//        int b = scanner.nextInt();
//        System.out.println("最大公约数：" + new Homework3().getGcd(a,b));
//    }
//    public int getGcd(int a ,int b ){
//        while (b>0) {
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        return a ;
        int i=10;
        int j=30;
        int min = i>j?j:i;
        for(int m=min;m>=1;m--){
            if(i%m==0&&j%m==0){
                System.out.println(m);
                break;
            }
        }
    }
}
