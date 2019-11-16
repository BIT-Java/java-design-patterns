package pl.mzlnk.bitjava.designpatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatMediatorTest {

    @Test
    void test() {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new User(mediator, "Adam");
        User user2 = new User(mediator, "Lisa");
        User user3 = new User(mediator, "John");
        User user4 = new User(mediator, "Amy");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}