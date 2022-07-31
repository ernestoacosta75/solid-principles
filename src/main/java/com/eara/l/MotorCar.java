package com.eara.l;

public class MotorCar extends Car {

    public MotorCar(int mileage) {
        super(mileage);
    }

    @Override
    protected void turnOnEngine() {
        System.out.println("Start MotorCar!");
    }

    @Override
    protected void accelerate() {
        System.out.println("Accelerate MotorCar!");
    }

    @Override
    protected void brake() {
        System.out.println("Apply MotorCar brake!");
    }
}
