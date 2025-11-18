package test;

public class test4 {
    public static void main(String[] args) {
        /*需求：
         * 把一个数组中的元素赋值到另一个新数组中去。
         */
        int[]arr={1,2,3,4,5};
        int[]arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
            System.out.println(arr1[i]);
        }
    }
}
