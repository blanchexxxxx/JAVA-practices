package test;

public class arrtest8 {
    public static void main(String[] args) {
        /*需求：
         * 定义一个数组，存入12345，交换首尾索引对应的元素。
         * 交换前：1，2，3，4，5
         * 交换后5，4，3，2，1
         */
        int[]arr={1,2,3,4,5};
        
        for(int i = 0, j = arr.length-1;i<j;i++,j--){
            arr[j]=arr[i];
            arr[i]=arr.length-i;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
