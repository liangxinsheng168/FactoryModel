package com.gupaoedu.designPattern.factoryModel.SimpleFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;
import com.gupaoedu.designPattern.factoryModel.PythonCourse;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

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

        course = factory.createCourse2(new JavaCourse());
        course.createCourse();
        course = factory.createCourse2(new PythonCourse());
        course.createCourse();
        course = factory.createCourse2(new ScalaCourse());
        course.createCourse();

        course = factory.createCourse3(JavaCourse.class);
        course.createCourse();
        course = factory.createCourse3(PythonCourse.class);
        course.createCourse();
        course = factory.createCourse3(ScalaCourse.class);
        course.createCourse();
    }
}
