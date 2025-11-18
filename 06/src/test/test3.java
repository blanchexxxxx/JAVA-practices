package test;

public class test3 {
    public static void main(String[] args) {
        //目标：要能区分出什么时候使用带返回值的方法
        //需求：定义方法，比较两个长方形的面积
       double sum1=compare(10, 20);
       double sum2 = compare(30, 40);
       System.out.println("sum1面积为"+sum1);
       System.out.println("sum2面积为"+sum2);
       
       if (sum1>sum2) {
        System.out.println("sum1大");
       }else{
        System.out.println("sum2大");
       }
    }
    public static double compare(double len, double width){
        double acreage = (len +width)*2;
        return acreage;
    }
}
