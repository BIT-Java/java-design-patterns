package pl.mzlnk.bitjava.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void test() {
        Shape square = new Square();
        Shape square2 = new Square();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(square);
        drawing.add(square2);
        drawing.add(circle);

        Drawing d2 = new Drawing();
//        d2.add(s3);
        d2.add(drawing);

        square.draw(Color.RED);
//        drawing.draw();
    }

}