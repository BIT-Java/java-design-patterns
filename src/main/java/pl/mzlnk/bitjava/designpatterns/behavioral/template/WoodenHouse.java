package pl.mzlnk.bitjava.designpatterns.behavioral.template;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wood coating");
    }

}
