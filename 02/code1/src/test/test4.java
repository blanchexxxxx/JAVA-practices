package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int number1=sp.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int number2=sp.nextInt();
        String result =number1==number2?"相同":"不同";
        System.out.println(result);

    }
}
