package pl.mzlnk.bitjava.designpatterns.structural.composite;

import java.awt.*;

public class Square implements Shape {

    @Override
    public void draw(Color color) {
        System.out.println("Draw square in " + color.toString());
    }

}
