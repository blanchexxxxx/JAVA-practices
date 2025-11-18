package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份，和头等舱或经济舱
         * 按照如下规则计算机票的价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月-来年4月）头等舱7折，经济舱6.5折
         */
        Scanner sp= new Scanner(System.in);
        System.out.println("请输入机票原价");
        int tickt = sp.nextInt();
        System.out.println("请输入月份");
        int month = sp.nextInt();
        System.out.println("头等舱为1 经济舱为2");
        int fly = sp.nextInt();
        if (fly == 1) {
            //如果是头等舱
            tickt= getPrice(tickt, month, 0.9, 0.7);
        }else if (fly==2) {
            //如果是经济舱
            tickt= getPrice(tickt, month, 0.85, 0.65);
        }else{
            //没有这个舱位
            System.out.println("没有这个舱位");
            tickt=0;
        }
        System.out.println("您折后的机票价格为"+tickt);
        sp.close();
        
    }
    public static int getPrice(int tickt,int month,double v0,double v1){
            if (month>=5&&month<=10) {
                

                tickt = (int)(tickt*v0);
            }else if ((month>=1&&month<=4)||(month>=11&&month<=12)){

                tickt = (int)(tickt*v1);

            }else{
                System.out.println("没有这个月份");
                tickt=0;
            }return tickt;
    }

}
