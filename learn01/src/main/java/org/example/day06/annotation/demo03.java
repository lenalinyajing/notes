package org.example.day06.annotation;

public class demo03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是："+person.name);

        //方式一 通过对象获得
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass.hashCode());
        //方式二 forName获得
        Class<?> aClass1 = Class.forName("org.example.day06.annotation.Student");
        System.out.println(aClass1.hashCode());
        //方式三  通过类名.class获得
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.hashCode());
        //方式四  基本内置类型的包装类都有一个Type属性
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        //获得父类类型
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }
}
class Person{
    public String name;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{"+"name='"+name+"\'"+"}";
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}

