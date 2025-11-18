package infinitelooop;

public class demo2 {
    public static void main(String[] args) {
        //1.跳过某一次循环
        for (int i = 1; i <=5; i++) {
            if (i > 3) {
                /*//结束本次循环，继续下次循环
                continue;*/
                //结束整个循环
                break;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
    }
}
