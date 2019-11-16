package pl.mzlnk.bitjava.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void test() {
        //create topic
        JavaTopic topic = new JavaTopic();

        //create observers
        Observer obs1 = new Subscriber("Observer 1");
        Observer obs2 = new Subscriber("Observer 2");
        Observer obs3 = new Subscriber("Observer 3");

        //register observers to the topic
        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);

        //attach observer to the topic
        obs1.setTopic(topic);
        obs2.setTopic(topic);
        obs3.setTopic(topic);

        //check if any update is available
        obs1.update();

        //now send message to subject
        topic.postMessage("Hi Everyone!");
    }

}