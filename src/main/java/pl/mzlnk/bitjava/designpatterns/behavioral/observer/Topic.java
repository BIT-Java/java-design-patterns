package pl.mzlnk.bitjava.designpatterns.behavioral.observer;

public interface Topic {

    public void register(Observer obj);
    public void unregister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);

}