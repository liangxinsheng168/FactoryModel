package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

public class ScalaCourseFactory implements FunctionFactory {

    @Override
    public Course createCourse() {

        return new ScalaCourse();

    }

}
