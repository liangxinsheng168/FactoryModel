package com.gupaoedu.designPattern.factoryModel.AbstractFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;
import com.gupaoedu.designPattern.factoryModel.PythonCourse;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

public class AbstractFactoryImpl extends AbstractFactory {
    @Override
    public Course getJavaCourse() {
        return new JavaCourse();
    }

    @Override
    public Course getPythonCourse() {
        return new PythonCourse();
    }

    @Override
    public Course getScalaCourse() {
        return new ScalaCourse();
    }
}
