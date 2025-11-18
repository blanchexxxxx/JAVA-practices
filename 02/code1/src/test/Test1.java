package test;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数
        Scanner sp =new Scanner(System.in);

        System.out.println("请输入一个三位数数字");

        int x=sp.nextInt();
        int ge=x %10;
        int shi=x/10%10;
        int bai=x/100%10;

        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
