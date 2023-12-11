package com.np.thapanarayan;

public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return height * width ;
    }

    public double findPerimeter() {
        return 2 * ( height + width);
    }

    @Override
    public String toString() {
        return "Rectangle [" + "width=" + width + ", height=" + height + ", color='" + color + "']";
    }
}
