package genericity;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

import static genericity.Genericity.*;

public class Test {
    public static void main(String[] args) {
        Plate<? extends Fruit> plate = new Plate<>(new Apple());
        System.out.println(plate.getItem());
        Plate<? super Fruit> plate1 = new Plate<>(new Fruit());
        plate1.setItem(new Apple());
        System.out.println(plate1.getItem());

        List<? super Fruit> list = Arrays.asList(1, 2, 3);
        soutType(list);
//        list.add(new Apple());
//        list.add(new Fruit());

        System.out.println(list);
        List<? extends Fruit> list2 = Arrays.asList(new Fruit(), new Apple());
        soutType(list2);
        Collections.copy(list, list2);
        System.out.println(list2);
    }

    private static <T> void soutType(List<T> list) {
        TypeVariable<? extends Class<? extends List>>[] typeParameters = list.getClass().getTypeParameters();
        for (TypeVariable<? extends Class<? extends List>> typeParameter : typeParameters) {
            Type[] bounds = typeParameter.getBounds();
            for (Type bound : bounds) {
                System.out.println(bound.getTypeName());
            }
        }
    }
}
