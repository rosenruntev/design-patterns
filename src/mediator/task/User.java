package mediator.task;

public abstract class User {

    private MessageMediator mediator;
    private String name;

    public User(MessageMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public MessageMediator getMediator() {
        return mediator;
    }

    public void setMediator(MessageMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}
