package com.gupaoedu.designPattern.factoryModel.SimpleFactory;

import com.gupaoedu.designPattern.factoryModel.Course;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Course course = null;
        course = factory.createCourse("Java");
        course.createCourse();
        course = factory.createCourse("Python");
        course.createCourse();
        course = factory.createCourse("Scala");
        course.createCourse();
    }
}
