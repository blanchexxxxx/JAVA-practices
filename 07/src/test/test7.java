package test;

public class test7 {
    public static void main(String[] args) {
        /*需求：
         * 把整数山的每一位都添加到数组
         * 反向推导
         */


         //1.计算出数组的长度
         int number = 12345;
         int temp = number;
         //定义一个变量进行统计
         int count = 0;
         while (temp != 0) {
            //每次循环就去掉右边的一个数字
            temp = temp/10;
            count++;
         }
         //2.定义一个数组
         //动态初始化
         int[]arr=new int[count];


         //3.把整数上的每一位都添加到数组中
         for (int i = arr.length-1; i >= 0; i--) {
            arr[i]= number%10;
            number = number/10;
         }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
         }

    }
}
