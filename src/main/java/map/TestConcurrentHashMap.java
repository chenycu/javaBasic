package map;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {
    public static void main(String[] args) {
//        ConcurrentHashMap cMap = new ConcurrentHashMap();
//        cMap.put("1", null);
//        System.out.println(cMap);
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            System.out.println(unsafe);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(TestConcurrentHashMap.class.getClassLoader());
    }
}
