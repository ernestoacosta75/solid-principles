package com.eara.i;

/**
 * Interface Segregation:
 * Larger interfaces should be split into smaller ones.
 * By doing so, we can ensure that implementing classes only need to be concerned
 * about the methods that are of interest to them.
 *
 * Unfortunately, our interface is rather large, and we have no choice but to implement the code to pet the bear.
 *
 * Let's fix this by splitting our large interface into three separate ones:
 * - BearCleaner
 * - BearFeeder
 * - BearPetter
 */
public interface BearKeeper {

    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
