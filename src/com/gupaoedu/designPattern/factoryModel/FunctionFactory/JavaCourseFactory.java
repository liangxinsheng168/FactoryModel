package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;

public class JavaCourseFactory implements FunctionFactory {

    @Override
    public Course createCourse() {

        return new JavaCourse();

    }

}
