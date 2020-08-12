package design.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestObserver {
    public static void main(String[] args) {
        ZhanSanObserver zhanSanObserver = new ZhanSanObserver();
        MySubject mySubject = new MySubject();
        mySubject.attach(zhanSanObserver);
        mySubject.doSomething("搞点事情");
    }
}
