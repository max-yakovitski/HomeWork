package by.yakovitski.mytasks.lesson8.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer("Задание 4: \n" +
                "Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать\n" +
                "1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,\n" +
                "который сохранит объект класса TextContainer.");
        Class<?> unknownClass = textContainer.getClass();
        SaveTo saveTo = unknownClass.getAnnotation(SaveTo.class);
        Method[] methods = unknownClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                try {
                    method.invoke(textContainer, saveTo.path());
                    System.out.println("сохранено");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
