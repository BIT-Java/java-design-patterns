package pl.mzlnk.bitjava.designpatterns.structural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(Color color) {
        shapes.forEach(shape -> shape.draw(color));
    }

    public void add(Shape s){
        this.shapes.add(s);
    }

    public void remove(Shape s){
        shapes.remove(s);
    }

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }

}
