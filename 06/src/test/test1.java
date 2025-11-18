package test;

public class test1 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果再方法中进行打印
        //目标：根据不同的需求，选择定义无参的方法还是带参数的方法
        getLength(5, 6);
    }
    //1.求长方形的周长
    public static void getLength(double len , double width){
        double l = (len+width)*2;
        System.out.println(l); 

    }
}
