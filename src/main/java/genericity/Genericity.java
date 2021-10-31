package genericity;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class Genericity {

    public static void main(String[] args) {
        System.out.println(1);
    }

    static class Food {

    }

    static class Fruit extends Food {

    }

    static class Apple extends Fruit {

    }
    static class Banana extends Fruit {

    }
    static class Pork extends Fruit {

    }

    static class RedApple extends Apple {

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

}
