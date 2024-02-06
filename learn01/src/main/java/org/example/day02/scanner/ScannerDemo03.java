package org.example.day02.scanner;

import java.util.Scanner;

public class ScannerDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m +1;
            sum = sum + x;
        }
        System.out.println("个数和为："+sum);
        System.out.println("个数平均值"+(sum/m));
    }
}
