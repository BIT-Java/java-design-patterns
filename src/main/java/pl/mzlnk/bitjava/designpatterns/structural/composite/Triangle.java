package pl.mzlnk.bitjava.designpatterns.structural.composite;

import java.awt.*;

public class Triangle implements Shape {

    @Override
    public void draw(Color color) {
        System.out.println("Draw triangle in " + color.toString());
    }

}
