package test;

public class test14 {
    public static void main(String[] args) {
        /*需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
         * 比如：求1-5之间的和
         */

         //分析：
         //1.循环1~5得到里面的每一个数字
         //开始条件：1
         //结束条件：5
         //作用：用来进行累加
         int sum =0;
         for(int i = 1; i <=5; i++){
            System.out.println(i);
         //可以把得到的每一个数字累加到变量sum当中
         sum=sum+i;//sum+=i;
         }
         System.out.println(sum);
    }
}
