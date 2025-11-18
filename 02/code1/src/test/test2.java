package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦程度");
        int myfashion =sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();

        //2.把我衣服的时髦度跟对方进行对比
        boolean result = myfashion>girlFashion;
        //3.打印结果
        System.out.println("恭喜你："+result);
    }
}
