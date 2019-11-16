package pl.mzlnk.bitjava.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Item {

    private UUID uuid;
    private double price;

}
