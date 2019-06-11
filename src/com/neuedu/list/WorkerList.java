package com.neuedu.list;
import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    public static void main(String[] args) {
        List<Worker> list=new ArrayList<>();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4  ",25  ,3500));
        list.add(new Worker("wang5 ",22 ,3200 ));
        System.out.println("修改前：");
        for(Worker w : list){
            System.out.println(w);
        }
        list.add(1,new Worker("zhao6",24,3300));
        list.remove(3);
        System.out.println("修改后：");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
