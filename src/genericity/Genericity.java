package genericity;

import java.util.ArrayList;
import java.util.List;

public class Genericity {

    static class A {

    }

    static class B extends A {

    }

    static class C extends  B {

    }

    static class Plate<T> {
        T item;
        public Plate(T t) {
            item = t;
        }
        public Plate() {

        }
        public void setItem(T t) {
            item = t;
        }

        public T getItem(){
            return item;
        }
    }

    public static void main(String[] args) {
        Plate<A> a = new Plate<>(new B());
        a.setItem(new A());
        a.setItem(new B());

        List<StringBuffer> s = new ArrayList<>();
        s.add(new StringBuffer("1"));
        s.add(new StringBuffer("2"));
        StringBuffer s1 = s.stream().findFirst().orElse(null);
        s1.append("kdioi");
        System.out.println(s1);
        System.out.println(s.get(0));

    }
}
