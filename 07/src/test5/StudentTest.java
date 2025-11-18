package test5;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //Student s = new Student();
        
        Student s = new Student("sp",6);
        System.out.println(s.getName());
        System.out.println(s.getAge());

    }
}
