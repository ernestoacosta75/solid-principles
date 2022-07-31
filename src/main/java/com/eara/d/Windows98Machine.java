package com.eara.d;

/**
 * The principle of dependency inversion refers to the decoupling of software modules.
 * This way, instead of high-level modules depending on low-level modules,
 * both will depend on abstractions.
 *
 * Here, we're using the dependency injection pattern to facilitate adding the
 * Keyboard dependency into the Windows98Machine class.
 */
public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
