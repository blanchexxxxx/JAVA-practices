package test;

import java.util.Random;

public class arrtest5 {
    public static void main(String[] args) {
        /*需求：生成10个1~00之间的随机数存入数组。
         * （1）求出所有数据的和
         * （2）求所有数据的平均数
         * （3）统计有多少个数据比平均值小
         */

         //分析：
         //1.定义数组
         int[]arr = new int[10];


         //2.把随机数组存入到数组当中
         Random r = new Random();
         for (int i = 0; i < arr.length; i++) {
             int number=r.nextInt(101);
             arr[i]=number;
             System.out.println(arr[i]);
         }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count=count+arr[i];
        }
        System.out.println("和为"+count);
        int average = count/arr.length;
        System.out.println("平均数为"+count/arr.length);
        
        int small = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<average) {
                small++;
            }
        }
        System.out.println("比平均值小的有"+small+"个");
         //3.
    }
}
