package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        /*
         * 某系统的数字密码（大于0).比如1983，采用加密的方式进行传输，
         * 规则如下：
         *    每位数加上5
         *    再对10求余
         *    最后将所有数字反转，
         *    得到一串新数。
         */
        int[]scoreArr = getScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i]);
        }
    }
    public static int[]getScore(){
        int[]arr = new int[4];
        Scanner sp = new Scanner(System.in);
        //录入数字
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第"+(i+1)+"位密码");
            arr[i]=sp.nextInt();
            if (arr[i]<0&&arr[i]>9) {
                System.out.println("密码超出数值请重新输入，当前位数"+(i+1));
            }else {
                i++;
            }
        }
        //加5取余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        //反转
        int sum = 0;
        for (int i = 0, j = arr.length-1; i < j; i++,j--) {
            sum=arr[i];
            arr[i]=arr[j];
            arr[j]=sum;
        }
        sp.close();
        return arr;
    }
}
