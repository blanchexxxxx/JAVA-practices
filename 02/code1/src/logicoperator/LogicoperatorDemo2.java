package logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //^异或
        //相同为flase，不同为true
        //了解一下即可
        System.out.println(false^true);//t
        System.out.println(false^false);//f
        System.out.println(true^true);//f
        System.out.println(true^false);//t

        //！逻辑非 取反
        //提示：
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);//t
        System.out.println(!true);//f


    }
}
