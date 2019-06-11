package com.neuedu.list;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list=new ArrayList();
        list.add(new Student("Tom",18,100,"class05"));
        list.add(new Student("Jerry",22,70,"class04"));
        list.add(new Student("Owen",25,90,"class04"));
        list.add(new Student("Jim",30,80,"class04"));
        list.add(new Student("Steve",28,66,"class04"));
        list.add(new Student("Kevin",24,100,"class04"));
        int sumage=0;
        int sumscore=0;
        for(Student s:list)
        {
            sumage+=s.getAge();
            sumscore+=s.getScore();
        }
        System.out.println("平均年龄为："+sumage/list.size());
        System.out.println("平均分为："+sumscore/list.size());
    }
}
