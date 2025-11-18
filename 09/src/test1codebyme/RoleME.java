package test1codebyme;

import java.util.Random;

public class RoleME {
    private String name1;
    private int blood1;
    private char gender;
    private String face;

    String[] boyface = { "美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇小", "相貌平平" };
    String[] grilface = { "风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平" };
    String[] noneface = { "沃尔玛购物袋", "拖拉机", "猫咪罐头", "铁棒槌", "宠物项圈", "螺旋桨直升机" };

    String[] attacks_desc = {
            "%s1%s", "%s2%s", "%s3%s", "%s4%s"
    };
    String[] injureds_desc = {
            "%s11", "%s22", "%s33", "%s44"
    };

    public RoleME() {
    }

    public RoleME(String name1, int blood1, char gender) {
        this.name1 = name1;
        this.blood1 = blood1;
        this.gender = gender;
        // 随机长相
        setFace(gender);

    }

    /**
     * @return String return the name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @param name1 the name1 to set
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * @return int return the blood1
     */
    public int getBlood1() {
        return blood1;
    }

    /**
     * @param blood1 the blood1 to set
     */
    public void setBlood1(int blood1) {
        this.blood1 = blood1;
    }

    public void attack(RoleME role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];

        // 输出一个攻击的效果
        System.out.printf(KungFu, this.getName1(), role.getName1());

        // 计算造成的伤害
        int hurt = r.nextInt(20) + 1;
        int remainBoold = getBlood1() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood1(remainBoold);

        // 受伤的描述
        /*
         * int index1 = r.nextInt(injureds_desc.length);
         * String injured = injureds_desc[index1];
         * 
         * System.out.printf(injured,role.getName1());
         */
        // 血量>76 0索引
        // 75-50 1
        // 49-25 2
        // 24-0 3
        if (remainBoold > 75) {
            System.out.printf(injureds_desc[0], role.getName1());
        } else if (remainBoold > 50) {
            System.out.printf(injureds_desc[1], role.getName1());
        } else if (remainBoold > 25) {
            System.out.printf(injureds_desc[2], role.getName1());
        } else {
            System.out.printf(injureds_desc[3], role.getName1());
        }
        System.out.println();
    }

    /**
     * @return char return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return String return the face
     */
    public String getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(char gender) {
        Random r = new Random();

        // 长相是随机的
        if (gender == '男') {
            // 从boyface里面随机长相
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        } else if (gender == '女') {
            int index = r.nextInt(grilface.length);
            this.face = grilface[index];
        } else {
            int index = r.nextInt(noneface.length);
            this.face = noneface[index];
        }

    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName1());
        System.out.println("血量为：" + getBlood1());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }

}
