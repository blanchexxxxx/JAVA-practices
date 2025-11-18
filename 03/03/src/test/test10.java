package test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        /*需求：键盘录入星期数，输出工作日，休息日
         * （1-5）工作日，（6-7）休息日。
         */
        System.out.println("请输入星期数");
        Scanner sp = new Scanner(System.in);
        int week = sp.nextInt();
        /*if (week>=1 && week<=5) {
            System.out.println("工作日");
        }else if (week==6 && week == 7) {
            System.out.println("休息日");
        }*/
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7->System.out.println("休息日");
            default->System.out.println("没有这个星期");
        }
        sp.close();
    }
}
