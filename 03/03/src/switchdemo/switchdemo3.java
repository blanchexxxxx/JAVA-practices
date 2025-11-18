package switchdemo;
/*case穿透
 * 语句没写break
 * 拿着值进行匹配遇到break才停止
 * 没有break会进行到底
 */
public class switchdemo3 {
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
