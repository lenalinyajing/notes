package org.example.day04.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//联系Thread，实现多线程同步下载图片
public class ThreadDemo02 extends Thread{

    private String url;
    private String name;

    public ThreadDemo02(String url,String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        webDoenloader webDoenloader = new webDoenloader();
        webDoenloader.downloader(url,name);
        System.out.println("下载了文件"+name);
//        super.run();
    }

    public static void main(String[] args) {
        ThreadDemo02 thread1 = new ThreadDemo02("https://pics5.baidu.com/feed/b219ebc4b74543a9f6aca7293a567487b8011462.jpeg@f_auto?token=09e3eb86f38c8d1a812eaf02fa96cfdf&amp;s=0E08F2021CB22FAFDD2D74840100A0E1","happy.jpg");
        ThreadDemo02 thread2 = new ThreadDemo02("https://pics0.baidu.com/feed/c75c10385343fbf2d62c4de2933f348564388fb2.jpeg@f_auto?token=56924b6daca814e3af89c7550ac45487&amp;s=0BEC7A221CF3A1A1EC316DD70100C0B1","new.jpg");
        ThreadDemo02 thread3 = new ThreadDemo02("https://pics6.baidu.com/feed/4bed2e738bd4b31c8e0c47aaa297d97a9e2ff8b2.jpeg@f_auto?token=119ac2b99ca1e5b8219ee458a1f1fa86&amp;s=5C9057954001C6EC6A20702D03009060","year.jpg");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class webDoenloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("IO异常，downLoader方法出现一擦航");
        }
    }
}
