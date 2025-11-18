package test8;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个数组用来储存学生对象
        Student[] arr = new Student[3];
        // 2.创建学生对象并添加进数组中
        Student stu1 = new Student(001, "blanchex", 23);
        Student stu2 = new Student(002, "Spirinter", 20);
        Student stu3 = new Student(003, "yz", 20);
        // 3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[3] = stu3;

        // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student stu4 = new Student(004, "sp", 17);
        // 唯一性判断

        // 把stu4添加到数组当中
        // 1.数组已经存满---只能创建一个新的数组，新数组的长度 = 老数组 +1
        // 2.数组没有存满--直接添加
        Student[] arr1 = new Student[arr.length + 1];

    }

    public static void contains() {

    }

}
