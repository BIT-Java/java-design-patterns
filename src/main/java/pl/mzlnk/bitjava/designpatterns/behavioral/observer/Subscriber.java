package pl.mzlnk.bitjava.designpatterns.behavioral.observer;

import lombok.Setter;

public class Subscriber implements Observer {

    private String name;

    @Setter
    private Topic topic;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Consuming message::" + msg);
    }

}
