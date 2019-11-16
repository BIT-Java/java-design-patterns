package pl.mzlnk.bitjava.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTemplateTest {

    @Test
    void test() {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

//        houseType = new BrickHouse();
//        houseType.buildHouse();
    }

}