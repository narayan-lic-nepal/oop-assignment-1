package com.np.thapanarayan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int speed() {
        return speed;
    }

    public boolean on() {
        return on;
    }

    public double radius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Fan [" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + "']";
    }
}
