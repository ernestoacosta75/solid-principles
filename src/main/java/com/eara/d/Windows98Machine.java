package com.eara.d;

/**
 * The principle states that we must use abstraction (abstract classes and interfaces)
 * instead of concrete implementations. High-level modules should not depend on the low-level module
 * but both should depend on the abstraction. Because the abstraction does not depend on detail but
 * the detail depends on abstraction. It decouples the software.
 *
 * Here, we're using the dependency injection pattern to facilitate adding the
 * Keyboard and Monitor dependencies into the Windows98Machine class.
 */
public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
