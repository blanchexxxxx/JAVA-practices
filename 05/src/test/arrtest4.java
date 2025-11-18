package test;

public class arrtest4 {
    public static void main(String[] args) {
    //max 的初始化值一定是数组中的值
    
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
