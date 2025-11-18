package test;

public class arrtest7 {
    public static void main(String[] args) {
        
        /*需求：定义一个数组，将数组中零索引和最大索引处的值进行交换 */

        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        int temp = arr[0];
        arr[0]=arr[4];
        arr[4]=temp;
        
    }
}
