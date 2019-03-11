package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class FunctionFactoryTest {

    public static void main(String[] args) {

        Course course = null;
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        course = javaCourseFactory.createCourse();
        course.createCourse();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        course = pythonCourseFactory.createCourse();
        course.createCourse();

        ScalaCourseFactory scalaCourseFactory = new ScalaCourseFactory();
        course = scalaCourseFactory.createCourse();
        course.createCourse();
    }

}
