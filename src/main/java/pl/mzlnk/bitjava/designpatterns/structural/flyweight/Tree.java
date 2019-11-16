package pl.mzlnk.bitjava.designpatterns.structural.flyweight;

import pl.mzlnk.bitjava.designpatterns.structural.flyweight.treetype.TreeType;

public class Tree {

    private int x;
    private int y;
    private int z;

    private TreeType treeType;

    public void build() {
        treeType.build(x, y, z);
    }

}
