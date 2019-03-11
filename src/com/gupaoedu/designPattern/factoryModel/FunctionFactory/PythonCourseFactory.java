package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.PythonCourse;

public class PythonCourseFactory implements FunctionFactory {

    @Override
    public Course createCourse() {

        return new PythonCourse();

    }

}
