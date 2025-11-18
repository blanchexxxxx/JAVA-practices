package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        System.out.println("请输入你带的钱");
        int money =sp.nextInt();
        if (money>=600) {
            System.out.println("支付成功");
        }else{
            System.out.println("支付失败");
        }
        sp.close();
    }
}
