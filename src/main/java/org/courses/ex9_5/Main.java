package org.courses.ex9_5;

public class Main {
    public static void main(String[] args) {
        TestClass t = MyClass.factoryMethod(TestClass.class);

        System.out.println("Print value: " + t + " this is created value");
    }
}