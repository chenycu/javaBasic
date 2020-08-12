package design.observer;

public class MySubject extends Subject{

    public void doSomething(String content) {
        System.out.println("我在做" + content);
        notifyObservers(content);
    }
}
