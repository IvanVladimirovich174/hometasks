package profilemodule.thirdhometask.task2;

import java.util.Optional;

public class ReflectionAnnotation {
    public static void getAnnotationValue(Class<?> cls) {
        Optional<IsLike> optionalAnnotation = Optional.ofNullable(
                cls.getAnnotation(IsLike.class));

        optionalAnnotation.ifPresentOrElse(
                (annotation) -> {
                    System.out.println("Class " + cls.getSimpleName() + " has IsLike annotation");
                    System.out.println("Value = " + annotation.value());
                    System.out.println();
                },

                () -> {
                    System.out.println("Class " + cls.getSimpleName() + " doesn't have IsLike annotation");
                    System.out.println();
                }
        );
    }
}