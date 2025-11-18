package test;

import java.util.Random;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        /*
         * 投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择；蓝色球号码从1-16中选择。
         */
        // 1.生成中奖号码 数组长度7

        int[] arr = createNumber();

        System.out.println("=======================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("=======================================");

        // 2.让用户输入彩票号码（红球+篮球）
        int[] userInputArr = userInputNumer();
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }

        // 3.判断用户丶中奖情况
        // 红球 篮球
        int redCount = 0;
        int blueCount = 0;
        // 判断红球

        for (int i = 0; i < 6; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    // 如果找到了，那么后面的数字就没有必要继续找了
                    // 跳出内循环，继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }

        // 判断篮球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        // 根据红球的个数以及蓝球的个数来判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你！一等奖!获得1000万!");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你!二等奖!获得500万!");
        } else if (redCount == 5 + 1 && blueCount == 1) {
            System.out.println("恭喜你!三等奖!获得3000!");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你!四等奖!获得200!");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你！五等奖!获得10!");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1)
                || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你!六等奖!获得5!");
        } else {
            System.out.println("谢谢参与");
        }

    }

    public static int[] userInputNumer() {
        // 1.创建一个数组用于添加号码
        int[] arr = new int[7];
        Scanner sp = new Scanner(System.in);
        // 让用户输入红球号码
        for (int i = 0; i < 6;) {
            System.out.println("请输入红球号码，当前输入位数为：" + (i + 1));
            int redNumber = sp.nextInt();

            boolean flag = contains(arr, redNumber);
            if (redNumber > 34 && redNumber < 1) {
                System.out.println("超出范围重新输入");
            } else if (!flag) {
                arr[i] = redNumber;
                i++;
            } else {
                System.out.println("当前红球号码已经存在，请重新输入");
            }

        }
        // 让用户输入蓝球号码；

        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sp.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[6] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围请重新输入");
            }
        }
        sp.close();
        return arr;

    }

    public static int[] createNumber() {
        // 1.创建数组用于添加中奖号码
        // 长度7
        int[] arr = new int[7];

        // 2.随机生成号码并添加到数组当中
        // 红球：不能重复的 1 2 3 4 5 6
        // 篮球：可以跟红球号码重复 5

        // 生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6;) {
            // 获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                // 把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }

        // 生成篮球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[6] = blueNumber;
        return arr;
    }

    // 用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
