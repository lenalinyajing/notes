package org.example.day04.Thread;

public class ThreadDemo03 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码-====="+i);
        }
    }

    public static void main(String[] args) {
        //main线程  主线程
        //创建一个对象
        ThreadDemo03 threadDemo01 = new ThreadDemo03();
        //放入Thread当中，调用start方法开启线程
        new Thread(threadDemo01).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程====="+i);
        }
    }
}
