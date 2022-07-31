package com.eara.i;

public class BearCarer implements BearCleaner, BearFeeder {

    @Override
    public void washTheBear() {
        System.out.println("I think we missed a spot..");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Tuna tuesdays..");
    }
}
