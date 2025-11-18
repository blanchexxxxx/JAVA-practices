package arraydemo;

public class arraydemo1 {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式：
        //数据类型[] 数组名 = new 数据类型 []{元素1，元素2....};
        //简化格式：
        //数据类型[] 数组名 = {元素1，元素2....};
        
        //1：定义数组储存5个学生的年龄
    /* int [] arr1 = new int[]{11,12,13,14};
        int [] arr2 = {11,12,13,14};

        //2：定义数组储存3个学生的姓名
        String[] arr3 = new String[]{"spirinter","blanchex","nuomi"}
        String[] arr4 = {"spirinter","blanchex","nuomi"};
        //2：定义数组储存4个学生的身高
        Double[] arr5 = new Double[]{163.0,168.3,178.3};*/

        Double[] arr6 = {163.0,168.3,178.3};
        System.out.println(arr6);
    }
}
