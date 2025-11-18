import java.util.Scanner;;
//1.导包，找到Scanner这个类在哪
//书写注意：要写在类定义的上面


public class ScannerDemo1 {
    public static void main(String[]args) {
    //创建对象，表示我现在要准备用Scanner这个类
    Scanner sc =new Scanner(System.in);
    System.out.println("请输入整数");
    //接收数据
    int i=sc.nextInt();

    System.out.println(i+1);
    }
}
