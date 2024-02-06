package org.example.day02.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接受键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法接受：");
        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            //使用next方法接受
            String next = scanner.nextLine();
            System.out.println("输出内容为："+next);
        }
        //判断用户有没有输入字符串
        scanner.close();
    }
}
