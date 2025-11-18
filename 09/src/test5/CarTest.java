package test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 1.创建一个数组用来存3个汽车对象；
        Car[] arr = new Car[3];

        // 2.创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            // 创建汽车的对象
            Car c = new Car();
            // 录入品牌
            System.out.println("请输入品牌名。");
            String name = sc.next();
            c.setName(name);
            // 录入价格
            System.out.println("请输入价格");
            Double price = sc.nextDouble();
            c.setCost(price);
            // 录入颜色
            System.out.println("请输入颜色");
            String colour = sc.next();
            c.setColour(colour);

            // 把汽车对象添加到数组当中
            arr[i] = c;

        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getName() + "," + car.getCost() + "," + car.getColour());
        }
        sc.close();

    }
}
