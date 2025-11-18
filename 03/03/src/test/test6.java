package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入小明的分数");
        int point = sp.nextInt();
        if (point>0 && point <=100) {
             if (point>=95&&point<=100) {
            System.out.println("真厉害！送你自行车！");
        }else if (point>=90&&point<=94) {
            System.out.println("真不错，咱们去游乐场玩吧！");
        }else if (point>=80&&point<=89) {
            System.out.println("很厉害呀，送你变形金刚一个！");
        }else {
            System.out.println("你死定了！");
        }
        }else{
            System.out.println("当前录入的成绩不合法");
        }
       
        sp.close();
    }
}
