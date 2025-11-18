package test1;

public class Gametest {
    public static void main(String[] args) {
        // 1.创建第一个角色
        Role r1 = new Role("blanchex", 100);
        // 2.创建第二个角色
        Role r2 = new Role("Spirinter", 100);

        while (true) {
            // 我揍sp
            r1.attack(r2);
            // 判断sp血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "揍飞了" + r2.getName() + "。");
                System.out.println(r2.getName() + "消失在了" + r1.getName() + "的视野外，再也不见。");
                System.out.println(r1.getName() + "抬头望着远方，好似山的那边有一个17岁的少年朝她挥挥手，笑着说：");
                System.out.println("“yz，往前走，不要回头。”");
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "一剑打倒了" + r1.getName() + "。");
                System.out.println(r2.getName() + "用复杂地眼神看了一眼" + r1.getName() + "。");
                System.out.println(r2.getName() + "转身离开了。");
                System.out.println("这是他们的最后一次相遇。");
                break;
            }
        }

    }
}
