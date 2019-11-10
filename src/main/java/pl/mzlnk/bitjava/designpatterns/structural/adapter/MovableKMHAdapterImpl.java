package pl.mzlnk.bitjava.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovableKMHAdapterImpl implements MovableKMHAdapter {

    private Movable movable;

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(movable.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
