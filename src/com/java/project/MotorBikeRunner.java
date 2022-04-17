package com.java.project;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike annonymous = new MotorBike(10);
        MotorBike hero = new MotorBike(100);
        MotorBike yamaha = new MotorBike(100);

        //hero.setSpeed(50);
        //yamaha.setSpeed(100);

        hero.increaseSpeed(100);
        yamaha.increaseSpeed(200);

        hero.decreaseSpeed(50);
        yamaha.decreaseSpeed(50);

        hero.Start();
        yamaha.Start();

        System.out.println(annonymous.getSpeed());
        System.out.println(hero.getSpeed());
        System.out.println(yamaha.getSpeed());
    }
}
