package com.neuedu.test;

public class TestCar {
    public static void main(String[] args) {
        Car aodi=new Car();
        aodi.mark="奥迪";
        aodi.price=300000;
        aodi.speed=100;

        aodi.market();
        aodi.drive();
        aodi.speedChange(120);

        System.out.println("------换车后---------");
        Car benchi=new Car();
        benchi.mark="奔驰";
        benchi.price=800000;
        benchi.speed=120;

        benchi.market();
        benchi.drive();
        benchi.speedChange(140);
    }
}
