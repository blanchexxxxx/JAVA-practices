package test;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("请输入一个整数");
      int x = sp.nextInt();
      int sampe = x ;
      int num = 0;
      while (x !=0) {
        int ge = x%10;
        x=x/10;
        num=num*10 + ge;
      }
      if (num==sampe) {
        System.out.println("true");
      }else System.out.println("fasle");
      sp.close();



     /*  int ge = x%10;
      int shi = x/10%10;
      int bai = x/100%10;
      int qian = x/1000%10;
      int wan = x/10000%10;
      int g = ge*10000 + shi *1000 + bai *100 + qian *10 + wan;
      if (x==g) {
        System.out.println("true");
      }else System.out.println("false");*/
    }
}
