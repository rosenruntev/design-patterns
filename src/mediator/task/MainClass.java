package mediator.task;

public class MainClass {

    public static void main(String[] args) {
        MessageMediator chat = new Chat();

        User ivan = new ChatUser(chat, "Ivan");
        User dimitur = new ChatUser(chat, "Dimitur");
        User maria = new ChatUser(chat, "Maria");

        ivan.sendMessage("Hello");
        dimitur.sendMessage("addBot");
        maria.sendMessage("cat");
    }
}
