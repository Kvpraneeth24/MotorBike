package com.java.project;

public class MotorBike {

    private int speed;

    MotorBike() {
        this(5);
    }

    MotorBike(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 0)
            this.speed = speed;
    }

    void Start() {
        System.out.println("Bike Started");
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(getSpeed() + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(getSpeed() - howMuch);
    }

}
