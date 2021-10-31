package design.sub_pub;

public class MyPublisher implements publisher<String> {

    @Override
    public void publish(String topic, String event) {
        System.out.println("我在"+ topic + "发布了" + event);
        Broker.getInstance().broadCasting(topic, event);
    }
}
