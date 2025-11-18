package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
       System.out.println("请输入第一个整数");
       int a=sp.nextInt();
       System.out.println("请输入第二个整数");
       int b=sp.nextInt();
       boolean result=a==6||b==6||(a+b)%6==0;
       System.out.println(result);
        
    }
}
