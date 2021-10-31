package design.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private Set<Observer> observers = new HashSet<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String content) {
        observers.forEach(observer -> {
            observer.update(content);
        });
    }
}
