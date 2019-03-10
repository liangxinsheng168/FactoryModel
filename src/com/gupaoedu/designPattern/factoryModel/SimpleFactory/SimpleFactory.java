package com.gupaoedu.designPattern.factoryModel.SimpleFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.JavaCourse;
import com.gupaoedu.designPattern.factoryModel.PythonCourse;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

public class SimpleFactory {

    public Course createCourse(String courseName){
        if(courseName.equals("Java")){
            return new JavaCourse();
        }else if(courseName.equals("Python")){
            return new PythonCourse();
        }else if(courseName.equals("Scala")){
            return new ScalaCourse();
        }
        return null;
    }

}
