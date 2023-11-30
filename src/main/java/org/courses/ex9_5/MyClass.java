package org.courses.ex9_5;

public class MyClass {

    public static <T> T factoryMethod(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
