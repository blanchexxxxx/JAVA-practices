package test;

import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner sp =new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sp.nextInt();
        System.out.println("请输入第二个整数");
        int b = sp.nextInt();
        int sum = 0;
        while (a>=b) {
            a=a-b;
            sum++;
        }
        System.out.println("商"+sum);
        System.out.println("余数"+a);
       
        sp.close();
    }
}
