package com.np.thapanarayan;



public class Question3 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 40, "yellow");
        Rectangle rectangle2 = new Rectangle(20, 30, "Red");

        System.out.println(rectangle1);
        System.out.println("Area : " + rectangle1.findArea() );
        System.out.println("Perimeter : " + rectangle1.findPerimeter());

        System.out.println(rectangle2);
        System.out.println("Area : " + rectangle2.findArea() );
        System.out.println("Perimeter : " + rectangle2.findPerimeter());

    }
}
