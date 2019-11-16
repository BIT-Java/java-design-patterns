package pl.mzlnk.bitjava.designpatterns.behavioral.template;

public class BrickHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building walls using bricks");
    }

    @Override
    public void buildWindows() {
        // code here
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with bricks coating");
    }

}
