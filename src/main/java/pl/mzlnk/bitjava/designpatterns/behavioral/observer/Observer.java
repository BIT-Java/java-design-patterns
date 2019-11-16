package pl.mzlnk.bitjava.designpatterns.behavioral.observer;

public interface Observer {

    public void update();
    public void setTopic(Topic sub);

}