package com.eara.l;

/**
 * By throwing a car without an engine into the mix, we are inherently changing the behavior of our program.
 * This is a blatant violation of Liskov substitution and is a bit harder to fix than our previous
 * two principles.
 *
 * One possible solution would be to rework our model into interfaces that take into account the engine-less
 * state of our Car.
 */
public class ElectricCar extends Car {


    public ElectricCar(int mileage) {
        super(mileage);
    }

    @Override
    protected void turnOnEngine() {
        throw new AssertionError("I am an Electric Car. I don't have an engine!");
    }

    @Override
    protected void accelerate() {
        System.out.println("This acceleration is crazy!");
    }

    @Override
    protected void brake() {
        System.out.println("Apply ElectricCar brake");
    }
}
