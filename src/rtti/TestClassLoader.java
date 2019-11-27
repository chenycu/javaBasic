package rtti;

import java.lang.reflect.Field;

public class TestClassLoader {

    public static void main(String[] args) {
        System.out.println(Initable.staticFinal);
//        Class<Initable> initableClass = Initable.class;
        try {
            Class<?> aClass = Class.forName("rtti.Initable");
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field field : declaredFields) {
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
