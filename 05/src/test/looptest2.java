package test;

import java.util.Scanner;

public class looptest2 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入一个大于二的整数");
        int count = sp.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i*i==count) {
                System.out.println(i);
                break;
            }else if (i*i>count) {
                System.out.println(i-1);
                break;
            }
           sp.close();
        }
        
    }
}
