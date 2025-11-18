package switchdemo;
/*
 *  switch新特性
 * jdk12
 */
public class switchdemo4 {
    public static void main(String[] args) {
       // 需求：
       //123-一二三
       int number = 1;
       switch (number) {
        case 1 ->System.out.println("一");
        case 2 ->System.out.println("二");
        case 3 ->System.out.println("三");
        default->System.out.println("666");
       }
    }
}
