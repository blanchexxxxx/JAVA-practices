package switchdemo;
/*
 * defauly的位置和省略
 * 位置：default不一定是写在最下面的，可以写任意位置
 * default可省略不建议省略
 */

public class switchdemo2 {
    public static void main(String[] args) {
     int number = 1;
     switch (number) {
        default:
            System.out.println("666");
            break;
        case 1:
            System.out.println("1");
            break;
        case 10:
            System.out.println("10");
            break;
        case 20:
            System.out.println("20");
            break;
     
      
     }   
    }
}
