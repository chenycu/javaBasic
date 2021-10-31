package annotation;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListener {
    Class<? extends NoticeTimeEndListener> listener();
}
