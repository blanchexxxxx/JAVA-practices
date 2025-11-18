package test;

public class arrtest1 {
    public static void main(String[] args) {
        /*定义一个数组，储存1，2，3，4，5
         * 遍历数组得到的每一个元素，求数组里面所有的数据和
         */

         //分析：
         //1.定义一个数组，并添加数据1，2，3，4，5
         int []arr={1,2,3,4,5};
         //2.遍历数组得到每一个数据，累加求和
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
            //i 以此表示数组里面的每一个索引
            //arr[i]一次表示数组里面的每一个元素
            count = count+arr[i];
         }
         System.out.println(count);
    }
}
