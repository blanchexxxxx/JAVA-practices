package test;

import java.util.Scanner;

public class looptest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数x，判断该整数是否为一个质数。
        //质数：如果一个整数只能被1和本身整除，那么这个数就是质数，否则就是合数。
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sp.nextInt();
        for (int i = 2; i < x; i++) {
            if (x%i==0) {
                System.out.println("合数");
                break;
            }else System.out.println("质数");
            break;
        }
        sp.close();
    }
}
