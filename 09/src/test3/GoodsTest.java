package test3;

public class GoodsTest {
    public static void main(String[] args) {
        // 1.创建一个数组
        Goods[] arr = new Goods[3];

        // 2.创建三个商品对象
        Goods g1 = new Goods("001", "カシスミルク", 2350.0, 100);
        Goods g2 = new Goods("002", "Orange", 150.5, 10);
        Goods g3 = new Goods("003", "颗秒！", 250.0, 300);

        // 3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        // 3.遍历
        for (int i = 0; i < arr.length; i++) {
            // i 索引 arr[i]元素
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());

        }
    }
}
