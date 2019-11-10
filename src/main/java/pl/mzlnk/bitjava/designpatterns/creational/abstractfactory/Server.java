package pl.mzlnk.bitjava.designpatterns.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Server implements Computer {

    private String ram;
    private String hdd;
    private String cpu;

}
