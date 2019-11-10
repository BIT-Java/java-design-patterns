package pl.mzlnk.bitjava.designpatterns.creational.abstractfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }

}
