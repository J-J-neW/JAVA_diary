package N1_staticDemo;

public class Test {
    public static void main(String[] args) {
        //1、类变量的用法
        //类名.类变量
        Student.name = "Hello";
        //对象.类变量
        //可以使用但步骤麻烦，不推荐
        Student s1 = new Student();
        s1.name = "Hello2";

        //2、实例变量的用法
        //对象.实例变量
        s1.age = 10;
        System.out.println(s1);

        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = new User();
        System.out.println(User.number);//4
    }
}
