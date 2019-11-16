package pl.mzlnk.bitjava.designpatterns.structural.decorator;

public class EcoCar extends CarDecorator {

    public EcoCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Eco Car. ");
    }

}
