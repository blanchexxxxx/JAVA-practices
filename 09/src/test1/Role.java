package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * @param blood the blood to set
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法用于攻击别人
    // 思考：谁攻击谁
    // Role r1 = new Role();
    // Role r2 = new Role();
    // r1.攻击（r2）;
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBoold = role.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了" +
                hurt + "伤害，" + role.getName() + "还剩下" + remainBoold + "点血");

    }
}
