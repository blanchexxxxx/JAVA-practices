package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入一个100以内的数字");
        int ticket = sp.nextInt();
        if (ticket>=0&& ticket<=100) {
             if (ticket%2==1) {
            System.out.println("左");
        }else{
            System.out.println("右");
        }
        }else{
            System.out.println("你站着吧，别坐了。");
        }
       
        sp.close();

    }
}