package test;

public class test7 {
    public static void main(String[] args) {
        //需求：定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        //1.定义数组
        int[]arr={1,2,3,4,5};
        boolean result=contains(arr, 1);
        System.out.println(result);
        

    }
    //2.创建方法
    static public boolean contains(int[]arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number) {
                return true;
            }
        }
        return false;
    }
}
