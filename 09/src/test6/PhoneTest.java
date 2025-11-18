package test6;

public class PhoneTest {
    public static void main(String[] args) {
        // 1.创建一个数组用来存三个手机对象
        Phone[] arr = new Phone[3];
        // 2.创建手机对象
        Phone p1 = new Phone("拖拉机", 4399.0, "绿");
        Phone p2 = new Phone("赛车", 6666.0, "红");
        Phone p3 = new Phone("召唤师奖杯", 9999.9, "FAKER");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        // 求平均值
        double avg = sum / arr.length;
        System.out.println(avg);

    }
}
