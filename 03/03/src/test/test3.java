package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        System.out.println("请录入身上的钱");
        int money=sp.nextInt();
        if (money>=100) {
            System.out.println("吃添好运");
        }else{
            System.out.println("吃沙县小吃");
        }
        sp.close();
    }
}
