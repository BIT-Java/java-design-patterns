package pl.mzlnk.bitjava.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    void test() {
        Movable subaru = new Subaru();

        MovableKMHAdapter adapter = new MovableKMHAdapterImpl(subaru);
        System.out.println("Speed: " + subaru.getSpeed());
        System.out.println("Speed: " + adapter.getSpeed());


    }

}