package com.eara.o;

/**
 * By extending the Guitar class, we can be sure that our existing application won't be affected.
 */
public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
        super(make, model, volume);
        this.flameColor = flameColor;
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
