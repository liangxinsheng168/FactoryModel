package com.gupaoedu.designPattern.factoryModel.SimpleFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;
import com.gupaoedu.designPattern.factoryModel.PythonCourse;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class SimpleFactory {

    public Course createCourse(String courseName) {
        if(courseName.equals("Java")) {
            return new JavaCourse();
        }else if(courseName.equals("Python")) {
            return new PythonCourse();
        }else if(courseName.equals("Scala")) {
            return new ScalaCourse();
        }
        return null;
    }

    public Course createCourse2(Course course) {
        if(course instanceof JavaCourse) {
            return new JavaCourse();
        }else if(course instanceof PythonCourse) {
            return new PythonCourse();
        }else if(course instanceof ScalaCourse) {
            return new ScalaCourse();
        }
        return null;
    }

    public <T extends Course> Course createCourse3(Class<T> clazz) {
        try {
            return clazz.newInstance();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
