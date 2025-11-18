package test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GrilFriend gf1 = new GrilFriend();
        //赋值
        gf1.setName("糯米");
        gf1.setAge(20);
        gf1.setGender("猫");

        //获取
        gf1.getAge();
        gf1.getGender();
        System.out.println(gf1.getAge());
        System.out.println(gf1.getName());
        System.out.println(gf1.getGender());


        
        gf1.live();
        gf1.work();


    }
}
