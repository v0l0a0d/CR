package com.company;

/**
 * Created by hillel on 27.07.17.
 */
class Circle implements Shape {

    double r;
    Colour colour;

    public Circle(Colour colour, double r){
        this.colour = colour;
        this.r = r;
    }

    public double size() {
        return Math.PI * Math.pow(r, 2);
    }


    public Colour colour() {
        return colour;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
