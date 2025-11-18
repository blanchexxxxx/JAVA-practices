package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*需求：在歌唱比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数
         * 选手最后的得分为：去掉最高分，最低分后的四个评委的平均分，
         */
        int[]scoreArr=getScore();
        int max = maxx(scoreArr);
        int min = getMinmin(scoreArr);

        int count = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            count = count+scoreArr[i];
        }
        int score = (count -max-min)/(scoreArr.length-2);
        System.out.println(score);
    }

    public static int maxx(int[]scoreArr){
        int max = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]>max) {
                max=scoreArr[i];
            }
        }
        return max;
    }
    public static int getMinmin(int[]scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]<min) {
                min=scoreArr[i];
            }
        }
        return min;
    }
    public static int[] getScore(){
        int[]arr = new int[6];
        Scanner sp = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入评委的打分,当前i为"+i);
            int scores = sp.nextInt();
            if(scores<=100&&scores>0){
             arr[i]=scores;
            i++;
            }else {
                System.out.println("分数不对重新输入,当前的i为："+i);
            }
           sp.close();;
        }
        return arr;
        /*int max = arr[0];
        int small = arr [0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }else if (arr[i]<small) {
                small = arr[i];
            }
        }*/
        
    }
}
