package org.example.day04.Thread;

/**
 * 　线程开启并不一定立即执行
 */
public class ThreadDemo01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码-====="+i);
        }
    }

    public static void main(String[] args) {
        //main线程  主线程

        ThreadDemo01 threadDemo01 = new ThreadDemo01();

        threadDemo01.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程====="+i);
        }
    }
}
