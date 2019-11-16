package pl.mzlnk.bitjava.designpatterns.structural.flyweight.treetype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseTreeType implements TreeType {

    private int leaves;
    private int height;

}
