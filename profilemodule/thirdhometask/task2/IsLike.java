package profilemodule.thirdhometask.task2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IsLike {
    boolean value() default false;
}