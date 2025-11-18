package test;
import java.util.Random;

public class looptest5 {
    public static void main(String[] args) {
        //先获取一个随机数
        //范围：0~10

        //1.导包
        //2.创建对象
        Random r = new Random();

        //3.生成随机数
        //从零开始，到这个数-1结束
        // r.nextInt(100);//0~100之间
        for (int i = 0; i <100; i++) {
            int number = r.nextInt(10);//0~9
            System.out.println(number);
        }

    }
}
