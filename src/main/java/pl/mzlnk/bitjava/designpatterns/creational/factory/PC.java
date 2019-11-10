package pl.mzlnk.bitjava.designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PC implements Computer {

    private String ram;
    private String hdd;
    private String cpu;

}
