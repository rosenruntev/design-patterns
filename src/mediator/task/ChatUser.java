package mediator.task;

public class ChatUser extends User {

    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(getName() + ": " + message);
        getMediator().sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(getName() + " received: " + message);
    }
}