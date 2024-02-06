package org.example.day02.scanner;

import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接受键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法接受：");

        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方法接受
            String next = scanner.next();
            System.out.println("输出内容为："+next);
        }
        scanner.close();
    }

}
