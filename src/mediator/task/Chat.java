package mediator.task;

import java.util.HashSet;
import java.util.Set;

public class Chat implements MessageMediator {

    private Set<User> users;
    private ChatBot chatBot;

    public Chat() {
        this.users = new HashSet<>();
    }

    @Override
    public void sendMessage(String message, ChatBot bot) {
        for(User user: this.users) {
            user.receiveMessage(message);
        }
    }

    @Override
    public void sendMessage(String message, User sender) {
        if (message.equals("addBot")) {
            chatBot = ChatBot.getInstance();
        }

        for(User user: this.users) {
            if(user != sender) {
                user.receiveMessage(message);
            }
        }

        if (chatBot != null) {
            chatBot.receiveMessage(message, sender, this);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user) {
        user.setMediator(null);
        this.users.remove(user);
    }
}