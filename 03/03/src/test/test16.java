package test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始");
        int a = sp.nextInt();
        System.out.println("请输入第二个数字表示范围的结束");
        int b = sp.nextInt();
        int sum=0;
        for (int i = a;i <=b; i++) {
           if (i%3==0&&i%5==0) {
            sum = sum+1;
           } 
        }
        System.out.println(sum);
        sp.close();
    }
}
