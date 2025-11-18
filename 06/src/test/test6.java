package test;

public class test6 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最大值返回

        //1.设计一个数组
        int[]arr={1,2,3,4,5};
        max(arr);
    }
    //
    static public int max(int[]arr){
        int max1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max1) {
                max1=arr[i];
            }
        }
        System.out.println(max1);
        return max1;
    }
}
