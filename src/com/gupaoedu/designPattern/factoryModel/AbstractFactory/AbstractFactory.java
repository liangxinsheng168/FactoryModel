package com.gupaoedu.designPattern.factoryModel.AbstractFactory;

import com.gupaoedu.designPattern.factoryModel.Course;

public abstract class AbstractFactory {

    public abstract Course getJavaCourse();

    public abstract Course getPythonCourse();

    public abstract Course getScalaCourse();
}
