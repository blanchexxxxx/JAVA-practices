package TwoDimension;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
         *   第一季度：22，66，44
         *   第二季度：77，33，88
         *   第三季度：25，45，65
         *   第四季度：11，66，99
         * 
         *   要求计算出每个季度的总营业额和全年的总营业额
         */
        int [][]arr = {
            {22,66,44},
            {77,33,88},
            {25,45,65},
            {11,66,99}
        };

        //2.遍历二维数组，得到每一个一维数组并求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int [] quarterArr = arr[i];
            int count = count(quarterArr);
            System.out.println("第"+ (i+1) + "个季度的总营业额为：" + count);
            sum =sum +count(quarterArr);
        }
        System.out.println("总营业额为：" + sum);

        //定义一个方法用来计算每一个季度的营业额
        

        
    }
    public static int count(int[]arr){
      int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            count1 = count1 +arr[i];
        }
        return count1;
    }
}
