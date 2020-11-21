package by.yakovitski.mytasks.lesson8.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface SaveTo {
    String path() default "/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/annotation/file.txt";
}