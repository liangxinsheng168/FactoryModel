package com.gupaoedu.designPattern.factoryModel.AbstractFactory;

import com.gupaoedu.designPattern.factoryModel.Course;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactoryImpl factory = new AbstractFactoryImpl();
        Course course = null;
        course = factory.getJavaCourse();
        course.createCourse();
        course = factory.getPythonCourse();
        course.createCourse();
        course = factory.getScalaCourse();
        course.createCourse();
    }
}
