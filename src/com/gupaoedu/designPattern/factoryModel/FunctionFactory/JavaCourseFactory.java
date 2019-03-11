package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class JavaCourseFactory implements FunctionFactory {

    @Override
    public Course createCourse() {

        return new JavaCourse();

    }

}
