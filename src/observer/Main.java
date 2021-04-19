package observer;

public class Main {
	public static void main(String[] args) {
		Observer firstSubscriber = new TopicSubscriber("Reader 1");
		Observer secondSubscriber = new TopicSubscriber("Reader 2");
		Observer thirdSubscriber = new TopicSubscriber("Reader 3");

		Topic topic = new Topic();
		topic.subscribe(firstSubscriber);
		topic.subscribe(secondSubscriber);
		topic.subscribe(thirdSubscriber);

		topic.setTopic("Breaking news...");
		topic.setTopic("Weather report...");
	}
}
