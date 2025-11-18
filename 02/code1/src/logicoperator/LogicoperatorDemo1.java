package logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.并且
        //两边都为真，结果才是真
        System.out.println(false&true);//f
        System.out.println(false&false);//f
        System.out.println(true&true);//t
        System.out.println(true&false);//f

        //2.| 或者
        //两边都为假，结果才是假
        System.out.println(false|true);//t
        System.out.println(false|false);//f
        System.out.println(true|true);//t
        System.out.println(true|false);//t

    }
}
