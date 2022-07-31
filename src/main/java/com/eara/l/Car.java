package com.eara.l;

/**
 * Liskov Substitution:
 *
 * It applies to inheritance in such a way that the derived classes must be completely substitutable
 * for their base classes.
 *
 * In other words, if class A is a subtype of class B, then we should be able to replace B with A without
 * interrupting the behavior of the program.
 *
 *  Car interface with a couple of methods that all cars should be able to fulfill:
 *  turning on the engine and accelerating forward.
 */
public abstract class Car {

    protected int limit;

    // invariant: speed < limit;
    protected int speed;

    // Allowed to be set once at the time of creation.
    // Value can only increment thereafter.
    // Value cannot be reset.
    protected int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    protected abstract void turnOnEngine();

    // postcondition: speed < limit
    protected abstract void accelerate();

    // postcondition: speed must reduce
    protected abstract void brake();
}
