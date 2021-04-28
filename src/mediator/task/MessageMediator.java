package mediator.task;

public interface MessageMediator {

    void sendMessage(String message, ChatBot bot);
    void sendMessage(String message, User sender);
    void addUser(User user);
    void removeUser(User user);
}