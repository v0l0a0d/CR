package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Enum.*;

public class Main {

    public static void main(String[] args) {
	// size без конструктора, colour - цена за м^2
        // принимаем только определенные цвета
        // выводим стоимость заполнения



        Shape first = new Circle(Colour.RED,5);
        Shape second = new Square(Colour.BLUE, 3);
        Shape third = new Square(Colour.GREEN, 3);
        Shape forth = new Square(Colour.GREEN,5);



        List<Shape> shapes = new ArrayList<>();
        //shapes.add(1, first);
        System.out.println(calculateCost (second, second.colour()));



    }

//    private double calculateCost(List<Shape> shapes, Colour colour) { return 0;}
    private static double calculateCost (Shape shapes, Colour colour) {
        return shapes.size() * colour.getCost;
    }
    // находим стоимость определенного цвета

    private Shape findLargest(List<Shape> shapes){
        return null;
        // находим самый дорогой
    }

}


