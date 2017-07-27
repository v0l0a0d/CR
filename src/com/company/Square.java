package com.company;

/**
 * Created by hillel on 27.07.17.
 */
public class Square implements Shape {

    double a = 0;
    Colour colour;

    public Square(Colour colour,double a){
        this.colour = colour;
        this.a = a;
    }

    public double size() {
        return Math.pow(a, 2);
    }



    public Colour colour() {
        return colour;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
