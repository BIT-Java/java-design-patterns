package pl.mzlnk.bitjava.designpatterns.structural.flyweight.treetype;

import java.awt.*;

public interface TreeType {

    void build(int x, int y, int z);

    public enum Type {

        OAK,
        SPRUCE;

    }
}
