package design.sub_pub;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Broker {
    private final Map<String, Set<Subscriber<String>>> subscribers = new HashMap<>();

    private Broker() {

    }

    private static class Instance {
        private static final Broker INSTANCE = new Broker();
    }

    public static Broker getInstance() {
        return Instance.INSTANCE;
    }

    public boolean addSub(String topic, Subscriber<String> subscriber) {
        if (subscribers.get(topic) == null) {
            Set<Subscriber<String>> objects = new HashSet<>();
            subscribers.put(topic, objects);
        }
        return subscribers.get(topic).add(subscriber);
    }

    public void broadCasting(String topic, String event) {
        subscribers.getOrDefault(topic, new HashSet<>()).forEach(subscriber -> {
            subscriber.onEvent(event);
        });
    }
}
