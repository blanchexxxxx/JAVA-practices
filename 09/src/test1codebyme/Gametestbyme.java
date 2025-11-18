package test1codebyme;

public class Gametestbyme {
    public static void main(String[] args) {
        // 创建第一个角色
        RoleME r1 = new RoleME("nuomi", 100, '女');
        // 创造第二个角色
        RoleME r2 = new RoleME("kele", 100, '男');

        // 展示一下角色的信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        // 循环打架

        while (true) {
            r1.attack(r2);
            if (r2.getBlood1() == 0) {
                System.out.println(r1.getName1() + "win");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood1() == 0) {
                System.out.println(r2.getName1() + "win");
                break;
            }

        }

    }
}
