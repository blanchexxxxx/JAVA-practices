package test7;

public class boyfriendTest {
    public static void main(String[] args) {
        // 定义数组
        boyfriend[] arr = new boyfriend[4];
        // 创建四个对象
        boyfriend b1 = new boyfriend("sp", 17, "男", "apex");
        boyfriend b2 = new boyfriend("khair", 18, "男", "blanchex");
        boyfriend b3 = new boyfriend("Spirinter", 20, "男", "valorant");
        boyfriend b4 = new boyfriend("akechihayasa", 17, "男", "streaming");

        arr[0] = b1;
        arr[1] = b2;
        arr[2] = b3;
        arr[3] = b4;

        // 计算出sp的平均年龄）
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boyfriend boyfriend = arr[i];
            sum = sum + boyfriend.getAge();
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boyfriend boyfriend = arr[i];
            if (boyfriend.getAge() < avg) {
                count = count + 1;
                System.out.println(boyfriend.getName() + "," + boyfriend.getAge() + "," + boyfriend.getGender() + ","
                        + boyfriend.getHobby());
            }

        }
        System.out.println("比平均年龄小的sp有" + count + "只，平均值为" + avg + "岁捏~(￣▽￣)~*。");

    }
}
