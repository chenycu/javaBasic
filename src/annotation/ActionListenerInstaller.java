package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ActionListenerInstaller {

    public static void install(Object targetObject) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Field[] declaredFields = targetObject.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(ActionListener.class)) {
                field.setAccessible(true);
                Action action;
                if (field.get(targetObject) == null){
                    action = new Action();
                    field.set(targetObject, action);
                } else {
                    action = (Action) field.get(targetObject);
                }
                Class<? extends NoticeTimeEndListener> listener = field.getAnnotation(ActionListener.class).listener();
//                Constructor<?>[] declaredConstructors = listener.getDeclaredConstructors();
//                for (Constructor constructor : declaredConstructors) {
//                    System.out.println(constructor);
//                }
                action.setListener(listener.getConstructor(targetObject.getClass()).newInstance(targetObject));
            }
        }
    }
}
