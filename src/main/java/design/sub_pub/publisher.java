package design.sub_pub;

public interface publisher<E> {

    void publish(String topic, E event);
}
