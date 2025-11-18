package test4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // nextInt();整数
        // nextDouble();小数
        // next();字符串
        // 遇到空格，制表符，回车就停止接受，这些符号后面的数据就不会接受了

        // nextLine();字符串
        // 可以接受空格，制表符，遇到回车才停止接收数据

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("请输入一个整数");
         * int num1 = sc.nextInt();
         * System.out.println(num1);
         * System.out.println("请输入第二个整数");
         * int num2 = sc.nextInt();
         * System.out.println(num2);
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("请输入一个字符串");
         * String str1 = sc.next();
         * System.out.println(str1);
         * System.out.println("请输入第二个字符串");
         * String str2 = sc.next();
         * System.out.println(str2);
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.nextLine();
        System.out.println(str2);
        sc.close();

    }
}
