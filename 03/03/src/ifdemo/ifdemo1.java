package ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
        //需求：键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应

        //if格式
        //if（关系表达式）{
          //语句体；
        //}


        //分析：
        //1.键盘录入女婿的酒量
        Scanner sp=new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine=sp.nextInt();

        //2.对酒量进行判断
        if (wine>2) {
           System.out.println("小伙子这么能喝啊！"); 
        }
        if (wine<=2) {
            System.out.println("这穆斯林连酒都不喝真麻烦雪儿快远离这种人");
        }
        sp.close();
    }
}
