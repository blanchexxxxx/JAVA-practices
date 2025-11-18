package test;

public class test18 {
    public static void main(String[] args) {
        //假如一张纸0.1毫米折叠几次能到珠穆朗玛峰一样高（8844.43米=8844430毫米）
        double i = 0.1;
        int b = 0;
        while (i <= 8844430) {
            i= 2 * i;
            b=b+1;
        }
        System.out.println(b);

    }
}
