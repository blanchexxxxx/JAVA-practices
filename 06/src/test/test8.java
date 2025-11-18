package test;

public class test8 {
    public static void main(String[] args) {
        /*需求：
         * 定义一个方法copyOfRange(int[]arr, int ,from , int to)
         * 功能：
         *    将数组arr中从索引from（包含from）开始。
         *    将索引to结束（不包含to)的元素复制到新数组中，
         * 将新数组返回
         */
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int[] copyarr=copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.println(copyarr[i]);
        }

    }
    public static int[]  copyOfRange(int[]arr,int from,int to){
       
        int[]arr1=new int[to-from];
        for (int i = from,  j=0; i <to; i++,j++) {
            arr1[j]=arr[i];
        }
        return arr1;



    }
}
