package design.sub_pub;

public interface Subscriber<E> {

    void onEvent(E event);
}
