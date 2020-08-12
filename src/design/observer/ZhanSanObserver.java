package design.observer;

public class ZhanSanObserver implements Observer {
    @Override
    public void update(String content) {
        System.out.println("ZhanSanObserver 收到了被观察者推送的数据content= + " + content);
    }
}
