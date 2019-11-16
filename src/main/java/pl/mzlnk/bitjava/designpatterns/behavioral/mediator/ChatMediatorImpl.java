package pl.mzlnk.bitjava.designpatterns.behavioral.mediator;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        this.users
                .stream()
                .filter(u -> u != user)
                .forEach(u -> u.receive(msg));
    }

}
