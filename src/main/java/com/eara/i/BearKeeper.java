package com.eara.i;

/**
 * Interface Segregation:
 * The principle states that the larger interfaces split into smaller ones.
 * Because the implementation classes use only the methods that are required.
 * We should not force the client to use the methods that they do not want to use.
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
