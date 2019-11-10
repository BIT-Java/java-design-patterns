package pl.mzlnk.bitjava.designpatterns.structural.composite;

import java.awt.*;

public class Circle implements Shape {

    @Override
    public void draw(Color color) {
        System.out.println("Draw circle in " + color.toString());
    }

}
