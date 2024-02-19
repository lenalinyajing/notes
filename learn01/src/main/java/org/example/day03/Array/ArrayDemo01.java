package org.example.day03.Array;

import java.util.Arrays;

public class ArrayDemo01 {

    public static void main(String[] args) {
        int[] array = {1,5,2,5,8};
        System.out.println(Arrays.toString(sort1(array)));
    }
    //排序
    /**
     * 冒泡怕许
     * 比较数组中，两个相邻的元素，如果第一个比第二个大，就交换位置
     * 每一次比较，都会产生出一个最大或者最小的数字
     * 下一轮可以少一次排序
     * 依次循环，知道结束
     */

    public static int[] sort1(int[] array){
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length-1-i;j++){
                if(array[j+1]>array[j]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
