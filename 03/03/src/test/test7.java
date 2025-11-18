package test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sp =new Scanner(System.in);
        int price = 1000;
        System.out.println("请输入你的会员等级");
        int vip = sp.nextInt();
        if (vip >=0 && vip <= 3) {
            if (vip == 1) {
                System.out.println("实际支付的钱为："+ price*0.9);
            }else if (vip == 2) {
                System.out.println("实际支付的钱为：" + price*0.8);
            }else if (vip == 3) {
                System.out.println("实际支付的钱为：" + price*0.7);
            }else{
                System.out.println("不打折，要打也是打骨折");
            }
        }else{
            System.out.println("你开玩笑呢");
        }
        sp.close();
    }
}
