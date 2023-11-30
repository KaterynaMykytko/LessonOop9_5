package org.courses.ex9_5;

public class TestClass {

    private String testValue;

    public TestClass() {
        this.testValue = "Testing default value";
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "testValue='" + testValue + '\'' +
                '}';
    }
}
