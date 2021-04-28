package mediator.task;

public class ChatBot {

    private static ChatBot instance;

    private ChatBot() {
    }

    public static ChatBot getInstance() {
        if (instance == null) {
            instance = new ChatBot();
        }

        return instance;
    }

    public void receiveMessage(String message, User sender, MessageMediator mediator) {
        if (message.equals("cat")) {
            mediator.removeUser(sender);
            mediator.sendMessage("'cat' is forbidden word!", this);
        }
    }
}
