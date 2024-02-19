package org.example.day06.annotation;
//啥是反射
public class demo02 {

    public static void main(String[] args) throws ClassNotFoundException{
        //通过反射获取class对象
        Class<?> aClass = Class.forName("org.example.day06.annotation.User");
        System.out.println(aClass);

    }
}

class User{
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
