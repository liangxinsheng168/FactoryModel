package com.gupaoedu.designPattern.factoryModel.AbstractFactory;

import com.gupaoedu.designPattern.factoryModel.Course;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public abstract class AbstractFactory {

    public abstract Course getJavaCourse();

    public abstract Course getPythonCourse();

    public abstract Course getScalaCourse();
}
