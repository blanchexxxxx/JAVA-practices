package test;

import java.util.Random;
import java.util.Scanner;

public class looptest7 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
        //注意事项：
        //生成随机数的代码 int number = r.nextInt(101);是不能写在循环里面的，否则每一次都会产生一个新的随机数
        //分析
        //1.生成一个1-100之间的随机数字
        //三次不对直接保底
        Random r = new Random();
        int number = r.nextInt(101);

        //2.猜测
        int count = 0;
        Scanner sp = new Scanner(System.in);
        System.out.println("考えている数字教えてください。");
        while (true) {
             int think = sp.nextInt();
             count++;
             if (count ==3) {
                System.out.println("别猜了，答案是"+number);
                break;
             }
        if (think>number) {
            System.out.println("もうちょっと小さくして");
        }else if (think<number) {
            System.out.println("もうちょっと大きくして");
        }else{
            System.out.println("あった！！おめでとうございます！");
            break;
        }
        }
        sp.close();
       
    }
}
