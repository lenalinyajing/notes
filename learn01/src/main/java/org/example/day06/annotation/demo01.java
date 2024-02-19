package org.example.day06.annotation;

import java.lang.annotation.*;

//测试元注解
public class demo01 {
    //注解可以显示赋值，如果没有默认值，我们必须给注解赋值
    @MyAnnotation(name = "lin")
    public void test(){

    }
}

//定义一个注解
//Target用于表示可用于什么哪些地方上
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention表示在什么地方有效  runtime>class>sources
@Retention(RetentionPolicy.RUNTIME)
//表示是否生成javaDoc中
@Documented
//表示子类可以继承父类的注解
@Inherited
@interface MyAnnotation{
    //注解的参数：参数类型+参数名（）；
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，，代表不存在

    String[] schools() default {"xidian","jiaoda"};

}
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention表示在什么地方有效  runtime>class>sources
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String value();
}