package com.neuedu.school;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner inupt = new Scanner(System.in);

        System.out.println("请输入姓名");
        String str = inupt.next();
        System.out.println("请输入学号");
        String a = inupt.next();
        System.out.println("请输入成绩一");
        double score1 = inupt.nextInt();
        System.out.println("请输入成绩二");
        double score2 = inupt.nextInt();
        System.out.println("请输入成绩三");
        double score3 = inupt.nextInt();

        Student student1 = new Student();
        student1.setSname(str);
        student1.setNum(a);
        student1.setScore1(score1);
        student1.setScore2(score2);
        student1.setScore3(score3);
        System.out.println(student1.toString());

        System.out.println("请输入姓名");
        String str1 = inupt.next();
        System.out.println("请输入学号");
        String a1 = inupt.next();
        System.out.println("请输入成绩一");
        double score4 = inupt.nextInt();
        System.out.println("请输入成绩二");
        double score5 = inupt.nextInt();
        System.out.println("请输入成绩三");
        double score6 = inupt.nextInt();

        Student student2 = new Student();
        student2.setSname(str1);
        student2.setNum(a1);
        student2.setScore1(score4);
        student2.setScore2(score5);
        student2.setScore3(score6);
        System.out.println(student2.toString());

        System.out.println("请输入姓名");
        String str2 = inupt.next();
        System.out.println("请输入学号");
        String a2 = inupt.next();
        System.out.println("请输入成绩一");
        double score7 = inupt.nextInt();
        System.out.println("请输入成绩二");
        double score8 = inupt.nextInt();
        System.out.println("请输入成绩三");
        double score9 = inupt.nextInt();
        Student student3 = new Student();
        student3.setSname(str2);
        student3.setNum(a2);
        student3.setScore1(score7);
        student3.setScore2(score8);
        student3.setScore3(score9);
        System.out.println(student3.toString());

        System.out.println("请输入姓名");
        String str3 = inupt.next();
        System.out.println("请输入学号");
        String a3 = inupt.next();
        System.out.println("请输入成绩一");
        double score10 = inupt.nextInt();
        System.out.println("请输入成绩二");
        double score11 = inupt.nextInt();
        System.out.println("请输入成绩三");
        double score12 = inupt.nextInt();
        Student student4 = new Student();
        student4.setSname(str3);
        student4.setNum(a3);
        student4.setScore1(score10);
        student4.setScore2(score11);
        student4.setScore3(score12);
        System.out.println(student4.toString());

        System.out.println("请输入姓名");
        String str4 = inupt.next();
        System.out.println("请输入学号");
        String a4 = inupt.next();
        System.out.println("请输入成绩一");
        double score13 = inupt.nextInt();
        System.out.println("请输入成绩二");
        double score14 = inupt.nextInt();
        System.out.println("请输入成绩三");
        double score15 = inupt.nextInt();
        Student student5 = new Student();
        student5.setSname(str4);
        student5.setNum(a4);
        student5.setScore1(score13);
        student5.setScore2(score14);
        student5.setScore3(score15);
        System.out.println(student5.toString());
    }
}
